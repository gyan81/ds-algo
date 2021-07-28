package com.mac.java.algorithm.recursion.string.subsequence;

public class StringSubSequence {

    public static void main(String[] args) {
        String str = "abc";
        StringSubSequence stringSubSequence = new StringSubSequence();
        System.out.println(stringSubSequence.getSubSequences(str));

    }

    public String getSubSequences(String str) {
        if (str.length() == 1) {
            return str;
        }
        char first = str.charAt(0);
        String rest = getSubSequences(str.substring(1));
        StringBuilder result = new StringBuilder();
        for (String subSeq : rest.split(",")) {
            result.append(",").append(subSeq);
            result.append(",").append(first).append(subSeq);
        }
        result.append(",").append(first);
        return result.substring(1);
    }

}
