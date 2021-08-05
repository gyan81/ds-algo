package com.mac.java.problems.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindThreeLargestNumbersTest {
    private static FindThreeLargestNumbers findThreeLargestNumbers = null;

    @BeforeAll
    static void setUp() {
        findThreeLargestNumbers = new FindThreeLargestNumbers();
    }

    @Test
    void solution1() {
        int[] data = {141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        int[] expected = {18, 141, 541};
        int[] result = findThreeLargestNumbers.solution(data);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution2() {
        int[] data = {7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7};
        int[] expected = {7, 7, 7};
        int[] result = findThreeLargestNumbers.solution(data);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution3() {
        int[] data = {-1, -2, -3, -7, -17, -27, -18, -541, -8, -7, 7};
        int[] expected = {-2, -1, 7};
        int[] result = findThreeLargestNumbers.solution(data);
        assertArrayEquals(expected, result);
    }

    @Test
    void solution4() {
        int[] data = {55, 7, 8};
        int[] expected = {7, 8, 55};
        int[] result = findThreeLargestNumbers.solution(data);
        assertArrayEquals(expected, result);
    }
}