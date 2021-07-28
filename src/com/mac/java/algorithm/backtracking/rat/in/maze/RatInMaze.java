package com.mac.java.algorithm.backtracking.rat.in.maze;

import java.util.ArrayList;
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

        List<Integer> dd = new ArrayList<>();

//        ratInMaze.print(maze);
//        ratInMaze.solution(maze, sol, 0, 0, n);
//        System.out.println("Solution");
//        ratInMaze.print(sol);
    }



}
