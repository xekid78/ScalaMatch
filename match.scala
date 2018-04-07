import scala.util.Random

object Match {
    def main(args: Array[String]): Unit = {
        val r = new Random
        val num = r.nextInt(5) + 1
        val omikuji = num match {
            case 1 => s"大吉"
            case 2 => s"中吉"
            case 3 => s"小吉"
            case 4 => s"吉"
            case 5 => s"凶"
            case _ => s"大凶"
        }
        println(omikuji)
    }
}
