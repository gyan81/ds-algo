package com.mac.java.algorithm.pattern.matching;

public class Naive {

    public static void main(String[] args) {
        String text = "Hello World!";
        String pattern = "World";
        Naive naive = new Naive();
        System.out.println(naive.solution(text, pattern));
    }

    private boolean solution(String text, String pattern) {
        if (text.length() >= pattern.length()) {
            char[] textArray = text.toCharArray();
            char[] patternArray = pattern.toCharArray();

            int i = 0;
            boolean matched = true;
            while (i < textArray.length - patternArray.length) {
                int j = 0;
                while (j < patternArray.length && textArray[i + j] == patternArray[j]) {
                    j++;
                }
                if (j == patternArray.length) {
                    return true;
                }
                i++;
            }
        }

        return false;
    }


}
