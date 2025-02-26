import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
    val wordArray1 = arrayOf("24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win")
    val wordArray2 = arrayOf("empowered", "value-added", "oriented", "focused", "aligned")
    val wordArray3 = arrayOf("process", "solution", "tipping-point", "strategy", "vision")

    for (element in 1..5) {
        val rand1 = (Random.nextInt(wordArray1.indices))
        val rand2 = (Random.nextInt(wordArray2.indices))
        val rand3 = (Random.nextInt(wordArray3.indices))

        println("rand1: $rand1, rand2: $rand2, rand3: $rand3")
        val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
        println(phrase)
    }
}