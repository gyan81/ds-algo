package com.mac.java.algorithm.pattern.matching;

public class BoyerMoore {
    private final static int NUM_OF_CHARS = 256;

    public int solution(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        if (n >= m) {
            int s = 0;
            int[] table = preprocessTable(pattern);
            while (s <= (n - m)) {
                int j = m - 1;
                while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                    j--;
                }
                if (j < 0) {
                    return s;
                } else {
                    s += Math.max(j - table[text.charAt(s + j)], 1);
                }
            }
        }
        return -1;
    }

    /**
     * Calculating the table based upon Bad Character Rule.
     *
     * @param pattern of String type
     * @return int[]
     */
    private int[] preprocessTable(String pattern) {
        int[] table = new int[NUM_OF_CHARS];
        int i = 0;
        while (i < table.length) {
            table[i++] = -1;
        }

        i = 0;
        while (i < pattern.length()) {
            table[pattern.charAt(i)] = i;
            i++;
        }
        return table;
    }

}
