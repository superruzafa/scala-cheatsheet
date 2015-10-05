val list = List(8, 3, 5, 1, 2)
list reduceLeft { (left, right) => left * 10 + right } // 83512
