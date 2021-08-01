package com.mac.java.algorithm.dynamic;

import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamic {
    private Map<Long, Long> table = null;

    public FibonacciDynamic() {
        table = new HashMap<>();
        table.put(0l, 0l);
        table.put(1l, 1l);
    }

    public static void main(String[] args) {
        long n = 100;
        FibonacciDynamic fibonacciDynamic = new FibonacciDynamic();
        System.out.println(fibonacciDynamic.fiboRecursive(n));
    }

    public long fiboRecursive(long n) {
        if (n >= 0) {
            if (table.containsKey(n)) {
                return table.get(n);
            } else {
                table.put(n, fiboRecursive(n - 1) + fiboRecursive(n - 2));
            }
            return table.get(n);
        }
        return n;
    }


}
