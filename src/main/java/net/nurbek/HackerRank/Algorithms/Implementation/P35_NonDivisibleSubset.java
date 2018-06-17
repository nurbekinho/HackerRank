package net.nurbek.HackerRank.Algorithms.Implementation;

public class P35_NonDivisibleSubset
{
    public static void main(String[] args)
    {
        System.out.println(nonDivisibleSubset(3, new int[]{1, 7, 2, 4}));
    }

    static int nonDivisibleSubset(int k, int[] S)
    {
        int size = 0;

        return size;
    }
}

// NOT SOLVED //

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