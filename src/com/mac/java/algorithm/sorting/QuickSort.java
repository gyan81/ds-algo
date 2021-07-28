package com.mac.java.algorithm.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = {22, 43, 3, 21, 12, 31, 1, 2, 19, 10};
//        int[] data = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        QuickSort quickSort = new QuickSort();
        System.out.println("Before Sorting : " + Arrays.toString(data));
        quickSort.sort(data, 0, data.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(data));
    }

    public void sort(int[] data, int l, int r) {
        if (l < r) {
            int pivot = partition(data, l, r);
            sort(data, l, pivot - 1);
            sort(data, pivot + 1, r);
        }
    }

    private int partition(int[] data, int l, int r) {
        int pivot = l;
        while (l < r) {
            while (l <= r && data[pivot] >= data[l]) {
                l++;
            }
            while (r >= 0 && data[pivot] < data[r]) {
                r--;
            }
            if (l < r) {
                swap(data, l, r);
            }
        }
        swap(data, pivot, r);
        pivot = r;

        return pivot;
    }

    private void swap(int[] data, int l, int r) {
        int temp = data[l];
        data[l] = data[r];
        data[r] = temp;
    }
}
