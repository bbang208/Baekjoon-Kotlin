
fun main() {
    val numbers: IntArray = intArrayOf(2, 1, 3, 4, 1)
    var chooseIndex = 0
    val answer: ArrayList<Int> = ArrayList()

    for (i in numbers.indices) {
        for (j in numbers.indices) {
            if (j == chooseIndex)
                continue
            val result = numbers[i] + numbers[j]
            if (!answer.contains(result))
                answer.add(chooseIndex, result)
        }
        chooseIndex++
    }

    answer.sort()
    println(answer.toIntArray())
}