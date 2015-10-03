val list = List(8, 3, -2, 6, 1)
list filterNot { n => n % 2 == 0 } // List(3, 1)
