package com.mac.java.ds.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TrieImpl {

    private class TrieNode {
        Map<Character, TrieNode> nextTrieNodes;
        boolean endOfWord;

        public TrieNode() {
            nextTrieNodes = new HashMap<>();
            endOfWord = false;
        }
    }

    private TrieNode root = null;

    public TrieImpl() {
        root = new TrieNode();
    }

    public void insert(String word) {

    }

    public boolean prefixSearch(String word) {
        return false;
    }

    public boolean wholeSearch(String word) {
        return false;
    }

    public void prefixDelete(String word) {

    }

    public void wholeDelete(String word) {

    }
}
