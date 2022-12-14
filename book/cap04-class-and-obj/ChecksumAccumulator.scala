import scala.collection.mutable

class ChecksumAccumulator:
  private var sum = 0

  def add(b: Byte): Unit =  sum += b

  def checksum(): Int = ~(sum & 0xFF) + 1


// Defining a singleton object.
// Singleton objects who share the same class name is called: Companion Object.
// The companion object must be in the same file and have the same relates class name.

object ChecksumAccumulator:
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int = 
    if cache.contains(s) then
      cache(s)
    else
      val acc = new ChecksumAccumulator
      for c <- s do
        acc.add((c >> 8).toByte)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
