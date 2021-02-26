import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {

    val t = nextInt()

    for (index in 0 until t) {
        val x1 = nextInt()
        val y1 = nextInt()
        val r1 = nextInt()
        val x2 = nextInt()
        val y2 = nextInt()
        val r2 = nextInt()

        val a1 = (x1.toDouble() - x2.toDouble()).pow((2).toDouble())
        val a2 = (y1.toDouble() - y2.toDouble()).pow((2).toDouble())
        val i = sqrt(a1 + a2)

        val r = r1.toDouble() + r2.toDouble()
        val rr = kotlin.math.abs(r1.toDouble() - r2.toDouble())

        if (r < i)
            println(0)
        else if (rr > i)
            println(0)
        else if (i.toInt() == 0 && r1 == r2)
            println(-1)
        else if (i == r)
            println(1)
        else if (i == rr)
            println(1)
        else
            println(2)

    }

}