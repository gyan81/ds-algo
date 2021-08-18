package com.mac.java.interview.problems.wallmart;

import java.util.HashMap;
import java.util.Map;

class Stack {
    int[] stack = null;
    int size;
    int lastIndex = -1;
    int minValue = Integer.MAX_VALUE;
    Map<Integer, Integer> table = null;

    public Stack(int size) {
        this.size = size;
        stack = new int[size];
        table = new HashMap<>();
    }

    public void push(int i) {
        if (lastIndex >= size - 1) {
            System.out.println("Stack is Over flow");
            return;
        }
        if (minValue > i) {
            minValue = i;
        }
        stack[++lastIndex] = i;
        table.put(lastIndex, minValue);
        System.out.println("Push : " + i);
    }

    public void pop() {
        if (lastIndex < 0) {
            System.out.println("Stack is under flow.");
            return;
        }
        int result = stack[lastIndex--];
        findMin();
        System.out.println("Pop : " + result);
    }

    private void findMin() {
        if (lastIndex >= 0) {
            minValue = table.get(lastIndex);
        } else {
            minValue = Integer.MAX_VALUE;
        }
    }

    public int getMinValue() {
        return minValue;
    }

    public void peek() {
        System.out.println("Peek : " + stack[lastIndex]);
    }
}

public class CustomStack {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(5);
        stack.push(8);
        stack.peek();
        System.out.println(stack.getMinValue());
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.getMinValue());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMinValue());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMinValue());
    }
}
