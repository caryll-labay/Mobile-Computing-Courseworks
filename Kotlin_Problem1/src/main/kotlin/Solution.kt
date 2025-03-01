package problem

fun solution(s: String): Pair<Char?, Int> {
    if (s.isEmpty()) {
        return Pair(null, 0)
    }

    var currentChar = s[0]
    var currentCount = 1
    var maxChar = s[0]
    var maxCount = 1

    for (i in 1 until s.length) {
        if (s[i] == currentChar) {
            currentCount++
        } else {
            if (currentCount > maxCount) {
                maxChar = currentChar
                maxCount = currentCount
            }
            currentChar = s[i]
            currentCount = 1
        }
    }

    if (currentCount > maxCount) {
        maxChar = currentChar
        maxCount = currentCount
    }

    return Pair(maxChar, maxCount)
}
