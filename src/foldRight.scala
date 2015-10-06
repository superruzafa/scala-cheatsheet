val list = List(83, 99, 97, 108, 97)
(list foldRight "") { (item, acc) => acc + item.toChar } // "alacS"
