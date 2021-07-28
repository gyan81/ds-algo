package com.mac.java.algorithm.sorting;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class QuickSortTest {

    private static QuickSort quickSort;

    @BeforeAll
    static void setUp() {
        quickSort = new QuickSort();
    }

    @Test
    void scenario1() {
        int[] data = {22, 43, 3, 21, 12, 31, 1, 2, 19, 10};
        System.out.println("Before Sorting : " + Arrays.toString(data));
        quickSort.sort(data, 0, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

    @Test
    void scenario2() {
        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println("Before Sorting : " + Arrays.toString(data));
        quickSort.sort(data, 0, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

    @Test
    void scenario3() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before Sorting : " + Arrays.toString(data));
        quickSort.sort(data, 0, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

}