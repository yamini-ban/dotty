import scala.reflect.ClassTag

object Test {
  def main(args: Array[String]): Unit = {

    assert(1 == Tuple1(1).apply(0))
    assert(1 == (1, 2).apply(0))
    assert(2 == (1, 2).apply(1))
    assert(1 == (1, 2, 3).apply(0))
    assert(2 == (1, 2, 3).apply(1))
    assert(3 == (1, 2, 3).apply(2))
    assert(1 == (1, 2, 3, 4).apply(0))
    assert(2 == (1, 2, 3, 4).apply(1))
    assert(3 == (1, 2, 3, 4).apply(2))
    assert(4 == (1, 2, 3, 4).apply(3))
    assert(1 == (1, 2, 3, 4, 5).apply(0))
    assert(2 == (1, 2, 3, 4, 5).apply(1))
    assert(3 == (1, 2, 3, 4, 5).apply(2))
    assert(4 == (1, 2, 3, 4, 5).apply(3))
    assert(5 == (1, 2, 3, 4, 5).apply(4))
    // TODO improve performace
//    assert(1 == (1, 2, 3, 4, 5, 6).apply(0))
//    assert(2 == (1, 2, 3, 4, 5, 6).apply(1))
//    assert(3 == (1, 2, 3, 4, 5, 6).apply(2))
//    assert(4 == (1, 2, 3, 4, 5, 6).apply(3))
//    assert(5 == (1, 2, 3, 4, 5, 6).apply(4))
//    assert(6 == (1, 2, 3, 4, 5, 6).apply(5))
//    assert(1 == (1, 2, 3, 4, 5, 6, 7).apply(0))
//    assert(2 == (1, 2, 3, 4, 5, 6, 7).apply(1))
//    assert(3 == (1, 2, 3, 4, 5, 6, 7).apply(2))
//    assert(4 == (1, 2, 3, 4, 5, 6, 7).apply(3))
//    assert(5 == (1, 2, 3, 4, 5, 6, 7).apply(4))
//    assert(6 == (1, 2, 3, 4, 5, 6, 7).apply(5))
//    assert(7 == (1, 2, 3, 4, 5, 6, 7).apply(6))
//    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8).apply(0))
//    assert(2 == (1, 2, 3, 4, 5, 6, 7, 8).apply(1))
//    assert(3 == (1, 2, 3, 4, 5, 6, 7, 8).apply(2))
//    assert(4 == (1, 2, 3, 4, 5, 6, 7, 8).apply(3))
//    assert(5 == (1, 2, 3, 4, 5, 6, 7, 8).apply(4))
//    assert(6 == (1, 2, 3, 4, 5, 6, 7, 8).apply(5))
//    assert(7 == (1, 2, 3, 4, 5, 6, 7, 8).apply(6))
//    assert(8 == (1, 2, 3, 4, 5, 6, 7, 8).apply(7))
//    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(0))
//    assert(2 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(1))
//    assert(3 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(2))
//    assert(4 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(3))
//    assert(5 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(4))
//    assert(6 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(5))
//    assert(7 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(6))
//    assert(8 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(7))
//    assert(9 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(8))
//    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(0))
//    assert(2 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(1))
//    assert(3 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(2))
//    assert(4 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(3))
//    assert(5 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(4))
//    assert(6 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(5))
//    assert(7 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(6))
//    assert(8 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(7))
//    assert(9 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(8))
//    assert(10 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(9))

    assert(1 == Tuple1(1).apply(0))
    assert(1 == (1, 2).apply(0))
    assert(1 == (1, 2, 3).apply(0))
    assert(1 == (1, 2, 3, 4).apply(0))
    assert(1 == (1, 2, 3, 4, 5).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24).apply(0))
    assert(1 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25).apply(0))

    assert(1 == Tuple1(1).apply(0))
    assert(2 == (1, 2).apply(1))
    assert(3 == (1, 2, 3).apply(2))
    assert(4 == (1, 2, 3, 4).apply(3))
    assert(5 == (1, 2, 3, 4, 5).apply(4))
    assert(6 == (1, 2, 3, 4, 5, 6).apply(5))
    assert(7 == (1, 2, 3, 4, 5, 6, 7).apply(6))
    assert(8 == (1, 2, 3, 4, 5, 6, 7, 8).apply(7))
    assert(9 == (1, 2, 3, 4, 5, 6, 7, 8, 9).apply(8))
    assert(10 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10).apply(9))
    assert(11 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11).apply(10))
    assert(12 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12).apply(11))
    assert(13 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13).apply(12))
    assert(14 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14).apply(13))
    assert(15 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15).apply(14))
    assert(16 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16).apply(15))
    assert(17 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17).apply(16))
    assert(18 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18).apply(17))
    assert(19 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19).apply(18))
    assert(20 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20).apply(19))
    assert(21 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21).apply(20))
    assert(22 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22).apply(21))
    assert(23 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23).apply(22))
    assert(24 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24).apply(23))
    assert(25 == (1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25).apply(24))

    assert(1 == (1 *: ()).apply(0))
    assert(1 == (1 *: 2 *: ()).apply(0))
    assert(1 == (1 *: 2 *: 3 *: ()).apply(0))
    assert(1 == (1 *: 2 *: 3 *: 4 *: ()).apply(0))
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: ()).apply(0))
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: ()).apply(0))
    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: ()).apply(0))
    // FIXME performace
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: ()).apply(0))
//    assert(1 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: 25 *: ()).apply(0))

    assert(1 == (1 *: ()).apply(0))
    assert(2 == (1 *: 2 *: ()).apply(1))
    assert(3 == (1 *: 2 *: 3 *: ()).apply(2))
    assert(4 == (1 *: 2 *: 3 *: 4 *: ()).apply(3))
    assert(5 == (1 *: 2 *: 3 *: 4 *: 5 *: ()).apply(4))
    assert(6 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: ()).apply(5))
    assert(7 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: ()).apply(6))
    // FIXME performace
//    assert(8 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: ()).apply(7))
//    assert(9 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: ()).apply(8))
//    assert(10 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: ()).apply(9))
//    assert(11 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: ()).apply(10))
//    assert(12 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: ()).apply(11))
//    assert(13 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: ()).apply(12))
//    assert(14 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: ()).apply(13))
//    assert(15 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: ()).apply(14))
//    assert(16 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: ()).apply(15))
//    assert(17 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: ()).apply(16))
//    assert(18 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: ()).apply(17))
//    assert(19 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: ()).apply(18))
//    assert(20 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: ()).apply(19))
//    assert(21 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: ()).apply(20))
//    assert(22 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: ()).apply(21))
//    assert(23 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: ()).apply(22))
//    assert(24 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: ()).apply(23))
//    assert(25 == (1 *: 2 *: 3 *: 4 *: 5 *: 6 *: 7 *: 8 *: 9 *: 10 *: 11 *: 12 *: 13 *: 14 *: 15 *: 16 *: 17 *: 18 *: 19 *: 20 *: 21 *: 22 *: 23 *: 24 *: 25 *: ()).apply(24))

  }
}