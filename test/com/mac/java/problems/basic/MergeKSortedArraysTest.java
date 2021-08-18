package com.mac.java.problems.basic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedArraysTest {
    private MergeKSortedArrays mergeKSortedArrays = null;

    @BeforeEach
    void setUp() {
        mergeKSortedArrays = new MergeKSortedArrays();
    }

    @Test
    void solution() {
        int[][] data = {{3, 5, 7}, {0, 6}, {0, 6, 28}};
        int[] result = mergeKSortedArrays.solution(data);
    }
}