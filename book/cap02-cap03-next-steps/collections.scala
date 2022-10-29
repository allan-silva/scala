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

  // Function call and asserts
  val args = formatArgs(List("zero", "one", "two"))
  assert(args == "zero\none\ntwo")

  // Data transform with mapping and for-yield
  val adjectives = List("One", "Two", "Red", "Blue")
  val nouns = adjectives.map(adj => adj + " Fish")
  printf("%s\n", nouns)

  val nouns2 =
    for adj <- adjectives yield
      adj + " Fish Yield"
  
  printf("%s\n", nouns2)

  // Map is available for other types
  val ques = Vector("Who", "What", "When", "Where", "Why")
  val withQuesMark = ques.map(q => q + "?")
  printf("%s\n", withQuesMark)

  //Option type and map
  val startsW = ques.find(q => q.startsWith("W"))
  val hasLen4 = ques.find(q => q.length == 4)
  val hasLen5 = ques.find(q => q.length == 5)
  val startsH = ques.find(q => q.startsWith("H"))

  printf("%s\n", List(startsW, hasLen4, hasLen5, startsH).mkString(","))

  //map option
  printf("%s\n", startsW.map(word => word.toUpperCase()))

  printf("%s\n", for word <- startsW yield word.toUpperCase)

  //map None results in None
  printf("%s\n", startsH.map(word => word.toUpperCase()))





def formatArgs(args: List[String]) = args.mkString("\n")
