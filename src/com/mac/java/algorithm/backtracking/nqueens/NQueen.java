package com.mac.java.algorithm.backtracking.nqueens;

public class NQueen {

    public static void main(String[] args) {
        int[][] board = new int[4][4];
        int queens = 4;
        NQueen nQueen = new NQueen();
        nQueen.solution(board, 0, 0, board.length);
    }

    public boolean solution(int[][] board, int row, int col, int n) {

        if (isSafe(board, row, col, n)) {
            return solution(board, 0, col + 1, n);
        }

        return false;
    }

    private boolean isSafe(int[][] board, int row, int col, int n) {


        return true;
    }


}
