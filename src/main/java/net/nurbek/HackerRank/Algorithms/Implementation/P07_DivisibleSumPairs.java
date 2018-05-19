package net.nurbek.HackerRank.Algorithms.Implementation;

public class P07_DivisibleSumPairs
{
    public static void main(String[] args)
    {
        int[] ar = {1, 3, 2, 6, 1, 2};

        System.out.println(5 == divisibleSumPairs(6, 3, ar));
    }

    static int divisibleSumPairs(int n, int k, int[] ar)
    {
        int[] a = new int[n];
        int count = 0;

        for(int i=0; i < n; i++)
        {
            if(i > 0)
            {
                for(int j = 0; j < i; j++)
                {
                    if((ar[i] + a[j]) % k == 0) count++;
                }
            }
            a[i] = ar[i];
        }

        return count;
    }
}

// SOLVED //

/*
You are given an array of n integers, a[0], ..., a[n-1], and a positive integer, k. Find and print the number of pairs
(i, j) where i < j and a[i] + a[j] is divisible by k.

Input Format
The first line contains 2 space-separated integers, n and k.
The second line contains n space-separated integers describing the values of ar[a[0], ..., a[n-1]].

Constraints
* 2 <= n <= 100
* 1 <= k <= 100
* 1 <= a[i] <= 100

Output Format
Print the number of (i, j) pairs where i < j and a[i] + a[j] is evenly divisible by k.

Sample Input
6 3
1 3 2 6 1 2

Sample Output
5

Explanation
Here are the 5 valid pairs when k = 3:
* (0,2) -> a[0] + a[2] = 1 + 2 = 3
* (0,5) -> a[0] + a[5] = 1 + 2 = 3
* (1,3) -> a[1] + a[3] = 3 + 6 = 9
* (2,4) -> a[2] + a[4] = 2 + 1 = 3
* (4,5) -> a[4] + a[5] = 1 + 2 = 3
*/