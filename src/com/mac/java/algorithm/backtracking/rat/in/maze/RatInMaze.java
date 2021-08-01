package com.mac.java.algorithm.backtracking.rat.in.maze;

import java.util.Arrays;

public class RatInMaze {

    public boolean solution(int[][] maze, int[][] solMaze, int row, int col, int n) {
        if (row == n - 1 && col == n - 1 && maze[row][col] == 1) {
            solMaze[row][col] = 1;
            return true;
        }
        if (isSafe(maze, row, col, n)) {
            solMaze[row][col] = 1;
            if (solution(maze, solMaze, row, col + 1, n)) {
                return true;
            }
            if (solution(maze, solMaze, row + 1, col, n)) {
                return true;
            }
            solMaze[row][col] = 0;
        }
        return false;
    }

    private boolean isSafe(int[][] maze, int row, int col, int n) {
        return row >= 0 && row < n && col >= 0 && col < n && maze[row][col] == 1;
    }
}
