package com.mac.java.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = {43, 22, 3, 21, 12, 31, 1, 2, 19, 10};
        System.out.println("Before Sorting : " + Arrays.toString(data));
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.recursiveSort(data, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

    public void recursiveSort(int[] data, int n) {
        if (n > 0) {
            recursiveSort(data, n - 1);
            int last = data[n];
            while (n > 0 && data[n - 1] > last) {
                data[n] = data[n - 1];
                n--;
            }
            data[n] = last;
        }
    }
}
