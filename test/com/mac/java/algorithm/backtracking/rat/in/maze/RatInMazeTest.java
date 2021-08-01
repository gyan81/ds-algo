package com.mac.java.algorithm.backtracking.rat.in.maze;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RatInMazeTest {

    private RatInMaze ratInMaze = null;

    @BeforeEach
    void setUp() {
        ratInMaze = new RatInMaze();
    }

    @Test
    void solution1() {
        int[][] maze = {{1, 1, 0, 0}, {1, 1, 1, 1}, {0, 1, 0, 0}, {0, 1, 1, 1}};
        int n = 4;
        int[][] sol = new int[n][n];
        ratInMaze.solution(maze, sol, 0, 0, n);
        int[][] expected = {{1, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 0, 0}, {0, 1, 1, 1}};
        assertArrayEquals(expected, sol);
    }

    @Test
    void solution2() {
        int[][] maze = {{1, 1, 0, 0}, {1, 0, 1, 1}, {0, 1, 0, 0}, {0, 1, 1, 1}};
        int n = 4;
        int[][] sol = new int[n][n];
        ratInMaze.solution(maze, sol, 0, 0, n);
        int[][] expected = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        assertArrayEquals(expected, sol);
    }
}