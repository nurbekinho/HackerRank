package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P61_AbsolutePermutation
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(absolutePermutation(4, 2)));
        System.out.println(Arrays.toString(absolutePermutation(2, 1)));
        System.out.println(Arrays.toString(absolutePermutation(3, 0)));
        System.out.println(Arrays.toString(absolutePermutation(3, 2)));

        // Test #2
        int[] n2 = {10, 10, 7, 10, 9, 10, 8, 8, 7, 10};
        int[] k2 = {0, 1, 0, 9, 0, 3, 2, 0, 0, 1};
        for(int i = 0; i < n2.length; i++)
        {
            System.out.println(Arrays.toString(absolutePermutation(n2[i], k2[i])));
        }
    }

    private static int[] absolutePermutation(int n, int k)
    {
        Set<Integer> elements = new HashSet();
        int[] results = new int[n];

        for(int i = 1; i <= n; i++)
        {
            if(results[i - 1] == 0)
            {
                int diff = k + i;

                if(elements.contains(diff) || diff > n)
                    break;

                results[i - 1] = diff;
                results[diff - 1] = i;

                elements.add(diff);
                elements.add(i);
            }
        }

        return (elements.size() == results.length) ? results : new int[]{-1};
    }
}

// SOLVED //

/*
We define "P" to be a permutation of the first "n" natural numbers in the range [1, n]. Let pos[i] denote the value at
position "i" in permutation "P" using 1-based indexing.

"P" is considered to be an absolute permutation if |pos[i] - i| = k holds true for every i element of [1, n].

Given n and k, print the lexicographically smallest absolute permutation P. If no absolute permutation exists, print -1.

For example, let n = 4 giving us an array pos = [1, 2, 3, 4]. If we use 1 based indexing, create a permutation where
every |pos[i] - i| = k. If k = 2, we could rearrange them to [3, 4, 1, 2]:

pos[i]	i	|Difference|
3	    1	2
4	    2	2
1	    3	2
2	    4	2

Input Format
The first line contains an integer t, the number of test cases.
Each of the next t lines contains 2 space-separated integers, n and k.

Output Format
On a new line for each test case, print the lexicographically smallest absolute permutation. If no absolute permutation
exists, print -1.

Sample Input
3
2 1
3 0
3 2

Sample Output
2 1
1 2 3
-1

Explanation

Test Case 0:
Position:       1 2
Permutation:    2 1
Abs diff:       0 0

Test Case 1:
Position:       1 2 3
Permutation:    1 2 3
Abs diff:       0 0 0

Test Case 2:
No absolute permutation exists, so we print -1 on a new line.
*/