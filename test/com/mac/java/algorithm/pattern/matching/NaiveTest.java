package com.mac.java.algorithm.pattern.matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaiveTest {

    private Naive naive = null;

    @BeforeEach
    void setUp() {
        naive = new Naive();
    }

    @Test
    void solution1() {
        String text = "Hello World!";
        String pattern = "World";
        assertEquals(6, naive.solution(text, pattern));
    }

    @Test
    void solution2() {
        String text = "Hello World!";
        String pattern = "world";
        assertEquals(-1, naive.solution(text, pattern));
    }
}