@main def main() =
  val greetStrings = new Array[String](3)
  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings.update(2, "World!\n")
  for i <- 0 to 2 do
    Console print greetStrings(i)
    print(greetStrings(i))

    // Array construct factory method, implicitly call to apply method
    val greetStrings2 = Array("Hey", "Teacher", "leave", "them", "kids", "alone\n")
    for i <- 0 to greetStrings2.length - 1 do
      if i != 0 then
        print(" ")
      print(greetStrings2(i))
