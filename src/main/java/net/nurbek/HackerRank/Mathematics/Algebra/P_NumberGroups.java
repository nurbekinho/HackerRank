package net.nurbek.HackerRank.Mathematics.Algebra;

public class P_NumberGroups
{
    public static void main(String[] args)
    {
        System.out.println(sumOfGroup(1));
        System.out.println(sumOfGroup(2));
        System.out.println(sumOfGroup(3));
        System.out.println(sumOfGroup(4));
        System.out.println(sumOfGroup(5));
        System.out.println(sumOfGroup(6));

        // Testcase #12
        System.out.println(sumOfGroup(574575));
    }

    private static long sumOfGroup(int k)
    {
        if(k == 1) return 1;
        else if(k == 2) return 3 + 5;

        long firstTerm = (long) k * (k - 1) + 1;
        long lastTerm = (long) firstTerm + (k - 1) * 2;

        System.out.println(firstTerm + " " + lastTerm);

        return (lastTerm + firstTerm) * (lastTerm - firstTerm + 2) / 4;
    }
}
