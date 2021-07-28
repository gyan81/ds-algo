package com.mac.java.algorithm.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] data = {13, 23, 2, 41, 54, 35, 17, 4};
        System.out.println(Arrays.toString(data));
        MergeSort mergeSort = new MergeSort();
        mergeSort.recursiveSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }

    public void recursiveSort(int[] data, int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            recursiveSort(data, low, mid);
            recursiveSort(data, mid + 1, high);
            merge(data, low, mid, high);
        }
    }

    private void merge(int[] data, int low, int mid, int high) {
        int size = (high - low) + 1, i = 0, li = low, mi = mid + 1;
        int[] temp = new int[size];
        while (li <= mid && mi <= high) {
            if (data[li] <= data[mi]) {
                temp[i++] = data[li++];
            } else {
                temp[i++] = data[mi++];
            }
        }
        while (li <= mid) {
            temp[i++] = data[li++];
        }
        while (mi <= high) {
            temp[i++] = data[mi++];
        }
        i = 0;
        while (low <= high) {
            data[low++] = temp[i++];
        }
    }
}
