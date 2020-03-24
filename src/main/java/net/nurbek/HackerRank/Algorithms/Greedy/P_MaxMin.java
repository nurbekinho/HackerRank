package net.nurbek.HackerRank.Algorithms.Greedy;

import java.util.Arrays;

public class P_MaxMin
{
    public static void main(String[] args) {
        System.out.println(maxMin(3, new int[]{10, 100, 300, 200, 1000, 20, 30}));
    }

    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);

        int min = 1000000000;

        for(int i = k - 1; i < arr.length; i++) min = Math.min(min, arr[i] - arr[i - k + 1]);

        return min;
    }
}

// SOLVED //