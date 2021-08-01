package com.mac.java.algorithm.pattern.matching;

public class RabinKarp {

    public int solution(String text, String pattern) {
        int textLength = text.length(), patternLength = pattern.length();
        if (textLength >= patternLength) {
            char[] textArray = text.toCharArray(), patternArray = pattern.toCharArray();
            int prime = 101;
            long textHash = calculateHash(textArray, patternLength, prime);
            long patternHash = calculateHash(patternArray, patternLength, prime);
            for (int i = 0; i < (textLength - patternLength); i++) {
                if (textHash == patternHash) {
                    int j = 0;
                    while (j < patternLength && textArray[i + j] == patternArray[j]) {
                        j++;
                    }
                    if (j == patternLength) {
                        return i;
                    }
                }
                textHash = recalculateHash(textArray, patternLength, textHash, prime, i);
            }
        }
        return -1;
    }

    private long recalculateHash(char[] textArray, int patternLength, long textHash, int prime, int index) {
        textHash -= textArray[index];
        textHash /= prime;
        textHash += textArray[index + patternLength] * (long) Math.pow(prime, patternLength - 1);
        return textHash;
    }

    private long calculateHash(char[] text, int length, int prime) {
        long hash = 0;
        for (int i = 0; i < length; i++) {
            hash += text[i] * (long) Math.pow(prime, i);
        }
        return hash;
    }

}
