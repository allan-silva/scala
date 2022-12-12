import scala.language.postfixOps

@main def m() = 
  // In scala operator are function calls
  val nr1 = 1+2
  // Is the same as
  val nr2 = 1.+(2)

  assert(nr1 == nr2)

  // Any method that accept one argument, can be used as operator notation
  val music = "Marvin, agora é só você"
  val commaIndex = music indexOf ","
  assert(commaIndex == 6)

  //Prefix and Postfix opetaror has one operand.
  val prefixNum1 = -2
  // is the same as
  val prefixNum2 = (2).unary_-
  assert(prefixNum1 == prefixNum2)

  // Calling a method in a post fix notation requires import scala.language.postfixOps
  val lcase = ("HEY, YOU!" toLowerCase)
  assert("hey, you!" == lcase)
