package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P35_NonDivisibleSubset
{
    public static void main(String[] args)
    {
        System.out.println(nonDivisibleSubset(13, new int[]{2375782, 21836421, 2139842193, 2138723, 23816, 21836219, 2948784, 43864923, 283648327, 23874673}) == 7);

        // Test #0
        System.out.println(nonDivisibleSubset(3, new int[]{1, 7, 2, 4}) == 3);

        // Test #2
        System.out.println(nonDivisibleSubset(9, new int[]{422346306, 940894801, 696810740, 862741861, 85835055, 313720373}) == 5);

        // Test #5
        System.out.println(nonDivisibleSubset(5, new int[]{2, 7, 12, 17, 22}) == 5);

        // Test #6
        System.out.println(nonDivisibleSubset(1, new int[]{1, 2, 3, 4, 5}) == 1);

        // Test #7
        System.out.println(nonDivisibleSubset(4, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}) == 5);
    }

    static int nonDivisibleSubset(int k, int[] S)
    {
        int subsets = 0;

        Map<Integer, Integer> remainders = new HashMap();
        for(int s : S)
        {
            int remainder = s % k;
            if (remainders.containsKey(remainder))
                remainders.put(remainder, remainders.get(remainder) + 1);
            else
                remainders.put(remainder, 1);
        }

        for (int i = 1; i <= (k / 2); i++)
        {
            if (i == k - i)
            {
                subsets++;
                continue;
            }
            else
            {
                subsets += Math.max(remainders.containsKey(i) ? remainders.get(i) : 0, remainders.containsKey(k - i) ? remainders.get(k - i) : 0);
            }
        }

        if (remainders.containsKey(0))
            subsets++;

        return subsets;
    }
}

// SOLVED //

/*
Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not
evenly divisible by k.

Input Format
The first line contains 2 space-separated integers, n and k, the number of values in S and the non factor.
The second line contains n space-separated integers describing S[i], the unique values of the set.

Output Format
Print the size of the largest possible subset (S').

Sample Input
4 3
1 7 2 4

Sample Output
3

Explanation
The sums of all permutations of two elements from S = {1, 7, 2, 4} are:
1 + 7 = 8
1 + 2 = 3
1 + 4 = 5
7 + 2 = 9
7 + 4 = 11
2 + 4 = 6

We see that only S' = {1, 7, 4} will not ever sum to a multiple of k = 3.
*/