package com.mac.java.problems.basic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MoveElementToEndTest {

    static MoveElementToEnd moveElementToEnd = null;

    @BeforeAll
    static void setUp() {
        moveElementToEnd = new MoveElementToEnd();
    }

    @Test
    void solve() {
        int[] data = {2, 1, 2, 2, 2, 3, 4, 2};
        int x = 2;
        int[] expected = {1, 3, 4, 2, 2, 2, 2, 2};
        moveElementToEnd.solve(data, x);
        assertArrayEquals(expected, data);
        System.out.println(Arrays.toString(data));
    }
}