package net.nurbek.HackerRank.InterviewPrep.Arrays;

import java.util.Arrays;

public class LeftRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotLeft(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3)));
    }

    private static int[] rotLeft(int[] a, int d) {
        if (d % a.length == 0) return a;

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(i - d + a.length) % a.length] = a[i];
        }

        return b;
    }
}

// SOLVED //