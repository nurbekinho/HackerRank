package net.nurbek.HackerRank.DataStructures.Arrays;

import java.util.Arrays;

public class P01_ArraysDS {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3, 4, 5})));
    }

    static int[] reverseArray(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }

        return a;
    }
}

// SOLVED //