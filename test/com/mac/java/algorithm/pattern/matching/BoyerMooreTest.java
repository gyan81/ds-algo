package com.mac.java.algorithm.pattern.matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoyerMooreTest {

    private BoyerMoore boyerMoore = null;

    @BeforeEach
    void setUp() {
        boyerMoore = new BoyerMoore();
    }

    @Test
    void solution1() {
        int index = boyerMoore.solution("ABAAABCD", "ABC");
        assertEquals(4, index);
    }

    @Test
    void solution2() {
        int index = boyerMoore.solution("Hello World!", "World");
        assertEquals(6, index);
    }

    @Test
    void solution3() {
        int index = boyerMoore.solution("Hello World!", "world");
        assertEquals(-1, index);
    }

    @Test
    void solution4() {
        int index = boyerMoore.solution("AACAABCD", "ABC");
        assertEquals(4, index);
    }

    @Test
    void solution5() {
        int index = boyerMoore.solution("ABCABDAB", "ABDAB");
        assertEquals(3, index);
    }

    @Test
    void solution6() {
        int index = boyerMoore.solution("ABBBABAB", "ABAB");
        assertEquals(4, index);
    }

}