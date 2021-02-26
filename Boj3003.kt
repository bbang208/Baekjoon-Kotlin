import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val arr = Array(6) { nextInt() }

    val chess = arrayOf(1, 1, 2, 2, 2, 8)

    for (i in arr.indices) {
        if (i < 5)
            print("${chess[i] - arr[i]} ")
        else
            println(chess[i] - arr[i])
    }

}