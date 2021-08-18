package com.mac.java.ds.trie;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TrieImplTest {

    private static TrieImpl trieImpl;

    @BeforeAll
    public static void setUp() {
        trieImpl = new TrieImpl();
    }

    @Test
    @Order(1)
    void insert() {
        trieImpl.insert("abcd");
    }

    @Test
    @Order(2)
    void prefixSearch() {
    }

    @Test
    @Order(3)
    void wholeSearch() {
    }

    @Test
    @Order(4)
    void prefixDelete() {
    }

    @Test
    @Order(5)
    void wholeDelete() {
    }
}