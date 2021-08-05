package com.mac.java.problems.basic;

public class MoveElementToEnd {

    public void solve(int[] data, int x) {
        int l = 0;
        while (l < data.length - 1) {
            while (l < data.length - 1 && data[l] != x) {
                l++;
            }
            int r = l + 1;
            while (r < data.length && data[r] == x) {
                r++;
            }
            if (l < data.length - 1 && r < data.length && data[l] != data[r]) {
                int temp = data[l];
                data[l] = data[r];
                data[r] = temp;
            }
            l++;
        }
    }
}