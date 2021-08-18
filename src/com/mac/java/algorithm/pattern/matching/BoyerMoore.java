package com.mac.java.algorithm.pattern.matching;

import java.util.HashMap;
import java.util.Map;

public class BoyerMoore {
    public int solution(String text, String pattern) {
        int n = text.length(), m = pattern.length();
        if (n >= m) {
            int s = 0;
            Map<Character, Integer> table = preprocessTable(pattern);
            while (s <= (n - m)) {
                int j = m - 1;
                while (j >= 0 && pattern.charAt(j) == text.charAt(s + j)) {
                    j--;
                }
                if (j < 0) {
                    return s;
                } else {
                    int index = table.get(text.charAt(s + j)) != null ? table.get(text.charAt(s + j)) : -1;
                    s += Math.max(1, j - index);
                }
            }
        }
        return -1;
    }

    /**
     * Calculating the table based upon Bad Character Rule.
     *
     * @param pattern of String type
     * @return Map<Character, Integer>
     */
    private Map<Character, Integer> preprocessTable(String pattern) {
        Map<Character, Integer> table = new HashMap<>();
        int i = 0;
        while (i < pattern.length()) {
            table.put(pattern.charAt(i), i);
            i++;
        }
        return table;
    }

}
