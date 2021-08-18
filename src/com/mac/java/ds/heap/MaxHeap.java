package com.mac.java.ds.heap;

import java.util.Arrays;

/*
a[(i-1) / 2] = Parent
a[(i*2) + 1] = left Child
a[(i*2) + 2] = right Child
 */
public class MaxHeap {

    public static void main(String[] args) {
        int k = 5;
        MaxHeap maxHeap = new MaxHeap(7);
        int[] data = {15, 10, 20, 40, 30, 25, 35};

        System.out.println(Arrays.toString(data));
        for (int e : data) {
            maxHeap.insert(e);
        }
    }

    private int size = 0, count = 0;
    private int[] heap = null;

    MaxHeap(int size) {
        this.size = size;
        heap = new int[size];
        Arrays.fill(heap, Integer.MIN_VALUE);
    }


    public int parent(int i) {
        return (i <= 0 || i >= count) ? -1 : (i - 1) / 2;
    }

    public int leftChild(int i) {
        int left = (2 * i) + 1;
        return left >= count ? -1 : left;
    }

    public int rightChild(int i) {
        int right = (2 * i) + 2;
        return right >= count ? -1 : right;
    }

    public int getMax() {
        return count == 0 ? -1 : heap[0];
    }


    public void insert(int e) {
//        if (count == size) {
//            resize();
//        }
        int i = 0;
        while (i < heap.length) {

        }

    }

    private void resize() {
        int[] temp = heap;
        size *= 2;
        heap = new int[size];
        System.arraycopy(temp, 0, heap, 0, temp.length);
    }

    public void delete() {
        if (count > 0) {
            int temp = heap[0];
            heap[0] = heap[count - 1];
            heap[count - 1] = temp;
            count--;
            heapifyingBottom(0);
        }

    }

    public void heapifyingTop() {

    }

    public void heapifyingBottom(int index) {
        if (count > 1 && index < count) {
            int leftChild = -1;
            int rightChild = -1;
            if (leftChild != -1 && rightChild != -1) {
                int maxIndex = -1;
                if (heap[index] < heap[leftChild]) {
                    maxIndex = leftChild;
                }

            }
        }
    }


}
