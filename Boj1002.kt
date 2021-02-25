import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    val t = nextInt()

    for (index in 0 until t) {
        val x1 = nextInt()
        val y1 = nextInt()
        val r1 = nextInt()
        val x2 = nextInt()
        val y2 = nextInt()
        val r2 = nextInt()

        val a1 = (x2.toDouble() - x1.toDouble()).pow((2).toDouble())
        val a2 = (y2.toDouble() - y1.toDouble()).pow((2).toDouble())
        val i = sqrt(a1 + a2)

        val r = r1.toDouble() + r2.toDouble()
        val rr = kotlin.math.abs(r2.toDouble() - r1.toDouble())

        if (x1 == y1 && x2 == y2) {
            if (r1 == r2)
                println(-1)
            else
                println(0)
        } else if (rr < i && i < r) {
            println(2)
        } else if (rr == i || r == i) {
            println(1)
        } else {
            println(0)
        }

    }

}