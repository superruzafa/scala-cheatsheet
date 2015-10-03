val list = List(4, 7, 2, -3, 2, -1, 8)
list dropWhile { n => n >= 0 } // List(-3, 2, -1, 8)
