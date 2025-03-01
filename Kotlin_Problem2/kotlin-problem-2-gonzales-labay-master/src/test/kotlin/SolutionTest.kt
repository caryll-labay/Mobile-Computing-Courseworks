package problem

import kotlin.test.assertEquals
import kotlin.test.Test

class SolutionTest {
    private fun customAssert(expected: Int, initial: Int, first: Int, second: Int, third: Int){
        val str = "Incorrect answer for input (${initial}, ${first}, ${second}, ${third})\n"
        assertEquals(message = str, expected = expected, actual = solution(initial, first, second, third))
    }

    @Test
    fun `The Sample Test`() {
        customAssert(1350, 0, 30, 0, 30)
        customAssert(1350, 5, 35, 5, 35)
        customAssert(1620, 0, 20, 0, 20)
        customAssert(1620, 7, 27, 7, 27)
        customAssert(1890, 0, 10, 0, 10)
        customAssert(1890, 9, 19, 9, 19)
        customAssert(1377, 5, 30, 39, 30)
        customAssert(1530, 4, 24, 36, 18)
    }

    @Test
    fun `Fixed Tests`() {
        customAssert(1494, 0, 24, 36, 18)
        customAssert(1521, 9, 4, 9, 10)
        customAssert(1269, 10, 32, 34, 33)
        customAssert(1107,0,39,0,39)
        customAssert(2133,0,1,0,1)
    }

    @Test
    fun `Testing Numbers in Consecutive Order`() {
        customAssert(1791, 0, 1, 2, 3)
        customAssert(1791, 4, 5, 6, 7)
        customAssert(1449, 39, 38, 37, 36)
    }
}
