package net.nurbek.HackerRank.Algorithms.Implementation;

public class P50_ChocolateFeast
{
    public static void main(String[] args)
    {
        System.out.println(chocolateFeast(10, 2, 5) == 6);
        System.out.println(chocolateFeast(12, 4, 4) == 3);
        System.out.println(chocolateFeast(6, 2, 2) == 5);

        // Test #1
        System.out.println(chocolateFeast(16809, 123, 11668) == 136);
        System.out.println(chocolateFeast(20373, 18211, 10188) == 1);
        System.out.println(chocolateFeast(92512, 413, 33040) == 224);

        // Test #5
        System.out.println(chocolateFeast(43203, 60, 5) == 899);
    }

    static int chocolateFeast(int n, int c, int m)
    {
        int result = n / c;
        int wrappers = result / m;
        int wrappersLeft = result % m;

        while (wrappers > 0)
        {
            int currentWrappers = wrappers;
            result += currentWrappers;
            wrappers = (currentWrappers + wrappersLeft) / m;
            wrappersLeft = (currentWrappers + wrappersLeft) % m;
        }

        return result;
    }
}

// SOLVED //

/*
Little Bobby loves chocolate. He frequently goes to his favorite 5 & 10 store, Penny Auntie, to buy them. They are having
a promotion at Penny Auntie. If Bobby saves enough wrappers, he can turn them in for a free chocolate.

Complete the chocolateFeast function in the code stub below to return the number of chocolates Bobby can eat with a given
amount of money after taking full advantage of the promotion.

Note: Little Bobby will always turn in his wrappers if he has enough to get a free chocolate.

Input Format
The first line contains an integer, t, denoting the number of scenarios to analyze.
Each of the next t lines contains three space-separated integers: n, c, and m. They represent money to spend, cost of a
chocolate, and the number of wrappers he can turn in for a free chocolate.

Output Format
For each trip to Penny Auntie, print the total number of chocolates Bobby eats on a new line.

Sample Input
3
10 2 5
12 4 4
6 2 2

Sample Output
6
3
5
*/