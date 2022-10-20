@main def m(argv: String*) =
  
  //While
  var i = 0
  while i < argv.length do
    if i != 0 then
      print(" ")
    print(argv(i))
    i += 1
  println()

  // Functional scala way
  // foreach
  argv.foreach(arg => println(arg))
  // Arg explicit
  argv.foreach((arg: String) => println(arg))
  // Partially applied function
  argv.foreach(println)

  // For expression
  for arg <- argv do
    println(arg)
