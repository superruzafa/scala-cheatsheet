val list = List(83, 99, 97, 108, 97)
(list foldLeft "") { (acc, item) => acc + item.toChar } // "Scala"
