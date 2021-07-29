package com.mac.java.algorithm.backtracking.rat.in.maze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RatInMaze {

    public static void main(String[] args) {
        int[][] maze = {
                {1, 1, 0, 0},
                {1, 1, 1, 1},
                {0, 1, 0, 0},
                {0, 1, 1, 1}
        };

        int n = 4;
        int[][] sol = new int[n][n];

        RatInMaze ratInMaze = new RatInMaze();
        ratInMaze.print(maze);
        ratInMaze.solution(maze, sol, 0, 0, n);
        System.out.println("Solution");
        ratInMaze.print(sol);
    }

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

    private void print(int[][] maze) {
        for (int[] mazeColumn : maze) {
            System.out.println(Arrays.toString(mazeColumn));
        }
    }

}
