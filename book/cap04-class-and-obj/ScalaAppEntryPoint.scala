import ChecksumAccumulator.calculate

// To this work:
  // 1) compile deps: scalac ChecksumAccumulator.scala ScalaAppEntryPoint.scala
  // 2) Run: scala ScalaAppEntryPoint Hey, teacher, leave them kids alone

object ScalaAppEntryPoint:
  def main(args: Array[String]): Unit =
    for arg <- args do
      println(arg + ": " + calculate(arg))
