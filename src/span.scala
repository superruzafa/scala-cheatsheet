val list = List(4, 7, 2, -3, 2, -1, 8)
list span { n => n >= 0 } // ( List(4, 7, 2), List(-3, 2, -1, 8) )
