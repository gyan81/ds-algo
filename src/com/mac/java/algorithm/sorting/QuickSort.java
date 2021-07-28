package com.mac.java.algorithm.sorting;

public class QuickSort {

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
