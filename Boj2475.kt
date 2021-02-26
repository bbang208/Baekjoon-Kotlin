import java.util.*
import kotlin.math.pow

fun main() = with(Scanner(System.`in`)) {
    val list = readLine()?.split(" ")

    var result: Double = (0).toDouble()

    for (item in list!!) {
        result += item.toDouble().pow(2)
    }

    println((result%10).toInt())
}