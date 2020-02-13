package net.nurbek.HackerRank.Algorithms.BitManipulation;

public class P01_LonelyInteger
{
    public static void main(String[] args)
    {
        System.out.println(lonelyinteger(new int[]{0, 0, 1, 2, 1}));
    }

    private static int lonelyinteger(int[] arr)
    {
        int result = 0;

        for(int a : arr) result ^= a;

        return result;
    }
}

// SOLVED //