import scala.collection.mutable

@main def run() =
  // Lists are immutable
  val a = List(1, 2, 3)
  val b = List(4, 5)

  // Concatenation :::
  val concatenation = a ::: b
  println(concatenation)

  // `Cons` :: , prepending element
  val prep = 0 :: b
  println(prep)

  // List initialization using Nil, Nil is an empty list
  // Const method `::`, is a method of right operand
  // so Nil is present only on List class, so Nil must comes last.
  val newList = 1 :: 2 :: 42 :: Nil
  println(newList)

  // Tuples
  val pair = (42, "Adams")
  val id = pair(0)
  val value = pair(1)
  printf("%d, %s\n", id, value)

  // Sets and maps
  // Immutable set
  var jetSet = Set("Boeing", "Airbus")
  jetSet += "Lear" // this creates new set plus "Lear" item ans reassign the variable.
  val query = jetSet.contains("Cessna")

  printf("%s, contains cessna: %s\n", jetSet, query)

  // Mutable set
  val movieSet = mutable.Set("Spotlight", "Moonlight")
  movieSet += "Parasite" // this does not reassign, just add an item on mutable set.
  movieSet.+=("The wire") // += is a method
  printf("%s\n", movieSet)

  // Map
  val tvShow = Map(
    0 -> Map("name" -> "The wire", "author" -> Map("name" -> "unknown")),
    // 2 -> Map("name" -> "Tales from loop", "author" -> Map[String, String]())
  )

  printf("%s\n", tvShow)
  printf("Name: %s - Author: %s\n", tvShow(0)("name"), tvShow(0)("author").asInstanceOf[Map[String, Object]]("name"))
  