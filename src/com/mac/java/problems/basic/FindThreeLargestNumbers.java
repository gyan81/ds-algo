package com.mac.java.problems.basic;

public class FindThreeLargestNumbers {

    public int[] solution(int[] array) {
        int i = 3, first = Integer.MIN_VALUE, second = Integer.MAX_VALUE, third = Integer.MAX_VALUE;
        int[] result = new int[i];
        int j = 0;
        while (j < array.length) {
            if (first <= array[j]) {
                third = second;
                second = first;
                first = array[j];
            } else if (second <= array[j]) {
                third = second;
                second = array[j];
            } else if (third <= array[j]) {
                third = array[j];
            }
            j++;
        }
        result[0] = third;
        result[1] = second;
        result[2] = first;
        return result;
    }

}
