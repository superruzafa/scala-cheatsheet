
Scala cheatsheet
================

Collections
-----------

### filter

Selects all elements of this traversable collection which satisfy a predicate.

```scala
def filter(p: (A) ⇒ Boolean): Seq[A]

val list = List(8, 3, -2, 6, 1)
list filter { n => n % 2 == 0 } // List(8, -2, 6)

```
![graphical filter](images/filter.png)



### filterNot

Selects all elements of this traversable collection which do not satisfy a predicate.

```scala
def filterNot(p: (A) ⇒ Boolean): Seq[A]

val list = List(8, 3, -2, 6, 1)
list filterNot { n => n % 2 == 0 } // List(3, 1)

```
![graphical filterNot](images/filterNot.png)



### map

Builds a new collection by applying a function to all elements of this sequence.

```scala
def map[B](f: A ⇒ B): Seq[B]

val list = List(83, 99, 97, 108, 97)
list map { code => code.toChar } // List('S', 'c', 'a', 'l', 'a')

```
![graphical map](images/map.png)



### partition

Partitions this traversable collection in two traversable collections according to a predicate.

```scala
def partition(p: (A) ⇒ Boolean): (Seq[A], Seq[A])

val list = List(8, 3, -2, 6, 1)
list partition { n => n % 2 == 0 } // ( List(8, -2, 6), List(3, 1) )

```
![graphical partition](images/partition.png)



### unzip

Converts this collection of pairs into two collections of the first and second half of each pair.

```scala
def unzip[A1, A2](implicit asPair: (A) ⇒ (A1, A2)): (Seq[A1], Seq[A2])

val pairlist = List((1, "one"), (2, "two"), (3, "three"))
pairlist.unzip // ( List(1, 2, 3), List("one", "two", "three") )

```
![graphical unzip](images/unzip.png)



### zip

Returns a sequence formed from this sequence and another iterable collection by combining corresponding elements in pairs.

```scala
def zip[B](that: GenIterable[B]): Seq[(A, B)]

val numbers = List(1, 2, 3, 4, 5)
val names = List("one", "two", "three")
numbers zip names // List( (1, "one"), (2, "two"), (3, "three") )

```
![graphical zip](images/zip.png)
