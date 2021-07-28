package com.mac.java.algorithm.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {22, 43, 3, 21, 12, 31, 1, 2, 19, 10};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Before Sorting : " + Arrays.toString(data));
//        bubbleSort.iterativeSort(data);
        bubbleSort.recursiveSort(data, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

    public void iterativeSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - (i + 1); j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j);
                }
            }
        }
    }

    private void recursiveSort(int[] data, int n) {
        if (n > 0) {
            sort(data, n - 1);
            recursiveSort(data, n - 1);
        }
    }

    private void sort(int[] data, int n) {
        if (n > 0) {
            sort(data, n - 1);
            if (data[n - 1] > data[n]) {
                swap(data, n - 1);
            }
        }
    }

    private void swap(int[] data, int j) {
        int temp = data[j];
        data[j] = data[j + 1];
        data[j + 1] = temp;
    }
}
