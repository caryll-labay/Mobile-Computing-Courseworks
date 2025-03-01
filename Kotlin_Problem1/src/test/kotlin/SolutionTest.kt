package problem

import kotlin.test.assertEquals
import kotlin.test.Test

class SolutionTest {
    private fun runTest(s:String,sol:Pair<Char?,Int>) = assertEquals(sol,solution(s))

    @Test
    fun testAddition() {
        val rr = arrayOf<Pair<String,Pair<Char?,Int>>>(
            Pair("aaaabb",Pair('a',4)),
            Pair("bbbaaabaaaa",Pair('a',4)),
            Pair("cbdeuuu900",Pair('u',3)),
            Pair("abbbbb",Pair('b',5)),
            Pair("aabb",Pair('a',2)),
            Pair("",Pair(null,0)),
            Pair("abcdefg",Pair('a',1)),
            Pair("ba",Pair('b',1))
        )
        rr.forEach { (inp,sol) -> runTest(inp,sol) }
    }
}
