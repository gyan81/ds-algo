package com.mac.java.algorithm.recursion.fibonacci;


public class Fibonacci {

    public int fiboIterative(int x) {
        int result = 0, n1 = 0, n2 = 1;
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        if (x >= 2) {
            for (int i = 2; i <= x; i++) {
                result = n1 + n2;
                n1 = n2;
                n2 = result;
            }
        }
        return result;
    }

    public int getNthFib(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1 || x == 2) {
            return 1;
        }
        return getNthFib(x - 1) + getNthFib(x - 2);
    }


    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getNthFib(50));
//        System.out.println(fibonacci.fiboIterative(7));
    }

}
