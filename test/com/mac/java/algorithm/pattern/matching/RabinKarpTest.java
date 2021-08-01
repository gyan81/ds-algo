package com.mac.java.algorithm.pattern.matching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RabinKarpTest {

    private RabinKarp rabinKarp = null;

    @BeforeEach
    void setUp() {
        rabinKarp = new RabinKarp();
    }

    @Test
    void solution1() {
        String text = "Hello World!", pattern = "World";
        assertEquals(6, rabinKarp.solution(text, pattern));
    }

    @Test
    void solution2() {
        String text = "Hello World!", pattern = "world";
        assertEquals(-1, rabinKarp.solution(text, pattern));
    }
}