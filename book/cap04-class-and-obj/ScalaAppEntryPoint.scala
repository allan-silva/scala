import ChecksumAccumulator.calculate

// To this work:
  // 1) compile deps scalac ChecksumAccumulator.scala
  // 2) Run scala ScalaAppEntryPoint.scala Hey, teacher, leave them kids alone

object Summer:
  def main(args: Array[String]): Unit =
    for arg <- args do
      println(arg + ": " + calculate(arg))
