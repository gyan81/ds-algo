package com.mac.java.algorithm.recursion.product.sum;

import java.util.List;

public class ProductSum {
    public static void main(String[] args) {
        List<Object> data = List.of(5, 2, List.of(7, -1), 3, List.of(6, List.of(-13, 8), 4));
        System.out.println(data);
        ProductSum productSum = new ProductSum();
        System.out.println(productSum.sum(data));
    }

    public int sum(List<Object> data) {
        return sum(data, 1);
    }

    private int sum(List<Object> data, int depth) {
        int result = 0;
        for (Object obj : data) {
            if (obj instanceof List) {
                result += sum((List<Object>) obj, depth + 1);
            } else {
                result += (Integer) obj;
            }
        }
        return result * depth;
    }
}
