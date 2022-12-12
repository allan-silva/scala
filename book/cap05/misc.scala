
@main def m() =
  // String strip marging, space before | is scaped.
  val floyd = """|There is no pain, you are receding
                 |A distant ship smoke on the horizon
                 |You are only coming through in waves
                 |Your lips move but I can't hear what you're saying
                 |When I was a child I had a fever
                 |My hands felt just like two balloons
                 |Now I've got that feeling once again
                 |I can't explain, you would not understand
                 |This is not how I am
                 |I have become comfortably numb"""
  println(floyd.stripMargin)

  // String interpolation
  val title = "Comfortably Numb"
  println(s"\n\nMusic: $title\n${floyd.stripMargin}")
