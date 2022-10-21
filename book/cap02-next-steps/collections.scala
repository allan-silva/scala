@main def run() =
  // Lists are immutable
  val a = List(1, 2, 3)
  val b = List(4, 5)

  // Concatenation :::
  val concatenation = a ::: b
  println(concatenation)

  //`Cons` :: , prepending element
  val prep = 0 :: b
  println(prep)

  // List initialization using Nil, Nil is an empty list
  // Const method `::`, is a method of right operand
  // so Nil is present only on List class, so Nil must comes last.
  val newList = 1 :: 2 :: 42 :: Nil
  println(newList)
