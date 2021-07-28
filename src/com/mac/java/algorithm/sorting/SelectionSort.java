package com.mac.java.algorithm.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {22, 43, 3, 21, 12, 31, 1, 2, 19, 10};
        System.out.println("Before Sorting : " + Arrays.toString(data));
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.recursiveSort(data, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

    public void recursiveSort(int[] data, int n) {
        if (n > 0) {
            int maxIndex = maxIndex(data, n, n);
            swap(data, maxIndex, n);
            recursiveSort(data, n - 1);
        }
    }

    private int maxIndex(int[] data, int maxIndex, int n) {
        if (n < 0) {
            return maxIndex;
        }
        maxIndex = data[maxIndex] < data[n] ? n : maxIndex;
        return maxIndex(data, maxIndex, n - 1);
    }

    private void swap(int[] data, int max, int n) {
        int temp = data[max];
        data[max] = data[n];
        data[n] = temp;
    }


}
