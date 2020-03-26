package net.nurbek.HackerRank.Algorithms.Greedy;

import java.util.Arrays;

public class P02_MarcsCakewalk
{
    public static void main(String[] args) {
        System.out.println(marcsCakewalk(new int[]{1, 3, 2}));
    }

    static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);

        long min = 0;

        for(int i = 0; i < calorie.length; i++) {
            min += Math.pow(2, i) * calorie[calorie.length - i - 1];
        }

        return min;
    }
}

// SOLVED //