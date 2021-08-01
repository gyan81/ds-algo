package com.mac.java.algorithm.pattern.matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KMPTest {
    private KMP kmp = null;

    @BeforeEach
    void setUp() {
        kmp = new KMP();
    }

    @Test
    void solution1() {
        String text = "abxabcabcaby", pattern = "abcaby";
        assertEquals(6, kmp.solution(text, pattern));
    }

    @Test
    void solution2() {
        String text = "abxabcabcaby", pattern = "abcabZ";
        assertEquals(-1, kmp.solution(text, pattern));
    }
}