package com.mac.java.algorithm.pattern.matching;

public class Naive {

    public int solution(String text, String pattern) {
        if (text.length() >= pattern.length()) {
            char[] textArray = text.toCharArray();
            char[] patternArray = pattern.toCharArray();
            int i = 0;
            while (i < textArray.length - patternArray.length) {
                int j = 0;
                while (j < patternArray.length && textArray[i + j] == patternArray[j]) {
                    j++;
                }
                if (j == patternArray.length) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
