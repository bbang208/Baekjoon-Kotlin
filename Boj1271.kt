import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val n = nextBigInteger()
    val m = nextBigInteger()

    println(n/m)
    println(n%m)
}