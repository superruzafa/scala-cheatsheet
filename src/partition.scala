val list = List(8, 3, -2, 6, 1)
list partition { n => n % 2 == 0 } // ( List(8, -2, 6), List(3, 1) )
