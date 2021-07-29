package com.mac.java.algorithm.recursion.staircase;

import java.util.*;

public class StairCaseProblem {
    private long[] map = null;


    public StairCaseProblem(long stairs) {
        map = new long[(int) (stairs + 1)];
        map[0] = 1;
        map[1] = 1;
    }

    public static void main(String[] args) {
        long stairs = 5;
        StairCaseProblem stairCaseProblem = new StairCaseProblem(stairs);
//        System.out.println(stairCaseProblem.solution(stairs));
        System.out.println(stairCaseProblem.solutionWithPath(stairs));
    }

    /**
     * This solution is to get the number of ways to cross the stairs
     *
     * @param stairs
     * @return
     */
    public long solution(long stairs) {
        if (stairs == 0 || stairs == 1) {
            return 1;
        }
        map[(int) stairs] = solution(stairs - 1) + solution(stairs - 2);
        return map[(int) stairs];
    }

    /**
     * This solution is to solve the staircase problem with the paths as a result
     *
     * @param stairs
     * @return
     */
    public List<String> solutionWithPath(long stairs) {
        if (stairs < 0) {
            return new ArrayList<>();
        }
        if (stairs == 0) {
            List<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        List<String> paths1 = solutionWithPath(stairs - 1);


        List<String> paths = new ArrayList<>();
        for (String path : paths1) {
            paths.add(1 + path);
        }

        List<String> paths2 = solutionWithPath(stairs - 2);
        for (String path : paths2) {
            paths.add(2 + path);
        }

        List<String> paths3 = solutionWithPath(stairs - 3);
        for (String path : paths3) {
            paths.add(3 + path);
        }
        return paths;
    }

}
