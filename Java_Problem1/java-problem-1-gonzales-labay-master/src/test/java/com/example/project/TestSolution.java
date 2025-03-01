package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TestSolution {

    @ParameterizedTest
    @CsvSource({
        "10, 23",
        "928, 201345",
        "476, 53043",
        "998, 232169",
        "184, 7833",
        "86, 1758",
        "-20, 0"
    })
   public void testSolution(int number, int expected)
   {
     int sum = Solution.solution(number);
     assertEquals(sum, expected);
   }
}
