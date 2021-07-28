package com.mac.java.algorithm.recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        List<List<Integer>> result = new ArrayList<>();
        int[] data = {1, 2, 3};
//        solution(data, result, 0, data.length - 1);
        result = getPermutations(array);
        System.out.println(result);

    }

    private static void solution(int[] data, List<List<Integer>> result, int l, int r) {
        if (l == r) {
            List<Integer> temp = new ArrayList<>();
            for (int d : data) {
                temp.add(d);
            }
            result.add(temp);
        } else {
            for (int i = l; i <= r; i++) {
                swap(data, l, i);
                solution(data, result, l + 1, r);
                swap(data, l, i);
            }
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static List<List<Integer>> getPermutations(List<Integer> array) {
        int[] data = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            data[i] = array.get(i);
        }
        List<List<Integer>> result = new ArrayList<>();
        solution(data, result, 0, array.size() - 1);
        return result;
    }

    private static void solution(List<Integer> array, List<List<Integer>> result, int l, int r) {
        if (l == r) {
            result.add(array);
        } else {
            for (int i = l; i <= r; i++) {
                swap(array, l, i);
                solution(array, result, l + 1, r);
                swap(array, l, i);
            }
        }
    }

    private static void swap(List<Integer> array, int a, int b) {
        int temp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, temp);
    }
}
