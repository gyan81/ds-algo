package com.mac.java.algorithm.recursion.factorial;

public class Factorial {

    public int factorialIterative(int x) {
        int result = 1;
        if (x > 0) {
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
        }
        return result;
    }

    public int factorialRecursive(int x) {
        if (x == 1) {
            return x;
        }
        return x * factorialRecursive(x - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println(factorial.factorialIterative(5));
    }
}
