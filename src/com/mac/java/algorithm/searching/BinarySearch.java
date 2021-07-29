package com.mac.java.algorithm.searching;

public class BinarySearch {

    public static void main(String[] args) {
        int[] data = {2, 3, 4, 10, 40};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.recursiveSearch(data, 0, data.length - 1, 10));
    }

    public int recursiveSearch(int[] data, int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (high + low) / 2;
        if (data[mid] == x) {
            return mid;
        }
        if (data[mid] < x) {
            return recursiveSearch(data, mid + 1, high, x);
        }
        return recursiveSearch(data, low, mid - 1, x);
    }

}
