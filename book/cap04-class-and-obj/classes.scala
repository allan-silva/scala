@main def m() =
  val acc = new ChecksumAccumulator
  acc.add(1)
  acc.add(2)
  println(acc.checksum())


class ChecksumAccumulator:
  private var sum = 0

  def add(b: Byte): Unit =  sum += b

  def checksum(): Int = ~(sum & 0xFF)
