package com.mac.java.algorithm.pattern.matching;

public class KMP {

    public int solution(String text, String pattern) {
        int[] table = populateTable(pattern);
        int i = 0, j = 0;
        while (i < text.length() && j < pattern.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                j++;
            } else if (j > 0) {
                j = table[j - 1];
                continue;
            }
            i++;
        }
        if (j == pattern.length()) {
            return i - j;
        }
        return -1;
    }

    private int[] populateTable(String text) {
        int[] table = new int[text.length()];
        int l = 0, r = 1;
        while (r < text.length()) {
            if (text.charAt(l) == text.charAt(r)) {
                table[r++] = ++l;
                continue;
            }
            if (l > 0) {
                l = table[l - 1];
            } else {
                r++;
            }
        }
        return table;
    }
}
