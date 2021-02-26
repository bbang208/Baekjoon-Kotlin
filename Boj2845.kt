import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val l = nextInt()
    val p = nextInt()

    val one = nextInt() - (l * p)
    val two = nextInt() - (l * p)
    val three = nextInt() - (l * p)
    val four = nextInt() - (l * p)
    val five = nextInt() - (l * p)

    println("$one $two $three $four $five")
}