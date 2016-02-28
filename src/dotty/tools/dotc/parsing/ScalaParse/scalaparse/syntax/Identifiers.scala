package dotty.tools
package dotc
package parsing
package dottyscalaparse.syntax
import acyclic.file
import fastparse.all._
import Basic._
import util.Positions._
import core.Constants._
import core.Names._
import core.StdNames._
import core.Contexts._ 


object Identifiers{
  import ast.untpd._
  import core.Decorators._
  val Operator = P(
    !Keywords ~ (!("/*" | "//") ~ (CharsWhile(x => isOpChar(x) && x != '/') | "/")).rep(1)
  )

  val VarId = VarId0(true)

  def VarId0(dollar: Boolean) = P( !Keywords ~ Lower ~ IdRest(dollar) )
  val PlainId = P( !Keywords ~ Index ~ (Upper ~ IdRest(true) | VarId | Operator ~ (!OpChar | &("/*" | "//"))).! ~ Index).map((x : Tuple3[Int,String,Int]) => termName(x._2.toCharArray(), x._1, x._3)).map(Ident)
  val PlainIdNoDollar = P( !Keywords ~ Index ~ (Upper ~ IdRest(false) | VarId0(false) | Operator).! ~ Index).map((x : Tuple3[Int,String,Int]) => termName(x._2.toCharArray(), x._1, x._3)).map(Ident)
  val BacktickId = P( "`" ~ Index ~ CharsWhile(_ != '`').! ~ Index ~ "`" ).map((x : Tuple3[Int,String,Int]) => termName(x._2.toCharArray(), x._1, x._3)).map(BackquotedIdent)
  val Id = P( BacktickId | PlainId )

  def IdRest(allowDollar: Boolean) = {
    val NonLetterDigitId = if(!allowDollar) "" else "$"
    val IdUnderscoreChunk = P( CharsWhile(_ ==  '_', min = 0) ~ CharsWhile(
      c => NonLetterDigitId.contains(c) || c.isLetter || c.isDigit
    ) )
    P( IdUnderscoreChunk.rep ~ (CharsWhile(_ == '_') ~ CharsWhile(isOpChar, min = 0)).? )
  }

  val alphaKeywords = Seq(
    "abstract", "case", "catch", "class", "def", "do", "else",
    "extends", "false", "finally", "final", "finally", "forSome",
    "for", "if", "implicit", "import", "lazy", "match", "new",
    "null", "object", "override", "package", "private", "protected",
    "return", "sealed", "super", "this", "throw", "trait", "try",
    "true", "type", "val", "var", "while", "with", "yield", "_", "macro"
  )

  val AlphabetKeywords = P {
    StringIn(alphaKeywords:_*) ~ !Letter
  }
  val symbolKeywords = Seq(
    ":", ";", "=>", "=", "<-", "<:", "<%", ">:", "#", "@", "\u21d2", "\u2190"
  ) 
  val SymbolicKeywords = P{
    StringIn(symbolKeywords:_*) ~ !OpChar
  }

  val keywords = alphaKeywords ++ symbolKeywords

  val Keywords = P( AlphabetKeywords | SymbolicKeywords )
}
