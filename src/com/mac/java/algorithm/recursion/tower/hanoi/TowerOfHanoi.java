package com.mac.java.algorithm.recursion.tower.hanoi;

public class TowerOfHanoi {

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.hanoiProblem(1, "SRC", "AUX", "DEST");
    }

    public void hanoiProblem(int x, String src, String aux, String dest) {
        if (x >= 1) {
            hanoiProblem(x - 1, src, dest, aux);
            System.out.println("Move a disc " + x + " from " + src + " to " + dest);
            hanoiProblem(x - 1, aux, src, dest);
        }
    }

}
