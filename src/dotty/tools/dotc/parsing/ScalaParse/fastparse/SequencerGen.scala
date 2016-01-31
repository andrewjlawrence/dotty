
        package fastparse
        trait SequencerGen[Sequencer[_, _, _]] extends LowestPriSequencer[Sequencer]{
          protected[this] def Sequencer0[A, B, C](f: (A, B) => C): Sequencer[A, B, C]
          
        implicit def Sequencer2[T1,T2,D]: Sequencer[(T1, T2), D, (T1,T2,D)] =
          Sequencer0((t, d) => (t._1, t._2, d))
        

        implicit def Sequencer3[T1,T2,T3,D]: Sequencer[(T1, T2, T3), D, (T1,T2,T3,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, d))
        

        implicit def Sequencer4[T1,T2,T3,T4,D]: Sequencer[(T1, T2, T3, T4), D, (T1,T2,T3,T4,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, d))
        

        implicit def Sequencer5[T1,T2,T3,T4,T5,D]: Sequencer[(T1, T2, T3, T4, T5), D, (T1,T2,T3,T4,T5,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, d))
        

        implicit def Sequencer6[T1,T2,T3,T4,T5,T6,D]: Sequencer[(T1, T2, T3, T4, T5, T6), D, (T1,T2,T3,T4,T5,T6,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, d))
        

        implicit def Sequencer7[T1,T2,T3,T4,T5,T6,T7,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7), D, (T1,T2,T3,T4,T5,T6,T7,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, d))
        

        implicit def Sequencer8[T1,T2,T3,T4,T5,T6,T7,T8,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8), D, (T1,T2,T3,T4,T5,T6,T7,T8,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, d))
        

        implicit def Sequencer9[T1,T2,T3,T4,T5,T6,T7,T8,T9,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, d))
        

        implicit def Sequencer10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, d))
        

        implicit def Sequencer11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, d))
        

        implicit def Sequencer12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, d))
        

        implicit def Sequencer13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, d))
        

        implicit def Sequencer14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, d))
        

        implicit def Sequencer15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, d))
        

        implicit def Sequencer16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, d))
        

        implicit def Sequencer17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, d))
        

        implicit def Sequencer18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, d))
        

        implicit def Sequencer19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, d))
        

        implicit def Sequencer20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, d))
        

        implicit def Sequencer21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,D]: Sequencer[(T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21), D, (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,D)] =
          Sequencer0((t, d) => (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, t._21, d))
        
        }
        trait LowestPriSequencer[Sequencer[_, _, _]]{
          protected[this] def Sequencer0[A, B, C](f: (A, B) => C): Sequencer[A, B, C]
          implicit def Sequencer1[T1, T2]: Sequencer[T1, T2, (T1, T2)] = Sequencer0{case (t1, t2) => (t1, t2)}
        }
      