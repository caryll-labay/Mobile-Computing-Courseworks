package problem

fun solution(initial: Int, first: Int, second: Int, third: Int): Int  {
     if (initial == 0 && first == 0 && second == 0 && third == 0) {
        return 0
    }

    var totalDegrees = 1080

    totalDegrees += (initial - first + 40) % 40 * 9
    totalDegrees += (second - first + 40) % 40 * 9
    totalDegrees += (second - third + 40) % 40 * 9

    return totalDegrees
}
