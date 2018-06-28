package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;

public class P47_MinimumDistances
{
    public static void main(String[] args)
    {
        System.out.println(minimumDistances(new int[]{7, 1, 3, 4, 1, 7}));
    }

    static int minimumDistances(int[] a)
    {
        int min = 100001;
        Map<Integer, Integer> stats = new HashMap();

        for(int i = 0; i < a.length; i++)
        {
            if(stats.containsKey(a[i])) min = Math.min(min, Math.abs(stats.get(a[i]) - i));
            stats.put(a[i], i);
        }

        return min > 100000 ? -1 : min;
    }
}

// SOLVED //

/*
We define the distance between two array values as the number of indices between the two values. Given "a", find the
minimum distance between any pair of equal elements in the array. If no such value exists, print "-1".

For example, if a = [3, 2, 1, 2, 3], there are two matching pairs of values: 3 and 2. The indices of the 3's are i = 0
and j = 4, so their distance is d[i, j] = |i - j| = 4. The indices of the 2's are i = 1 and j = 3, so their distance is
d[i, j] = |i - j| = 2.

Input Format
The first line contains an integer n, the size of array a.
The second line contains n space-separated integers a[i].

Output Format
Print a single integer denoting the minimum d[i, j] in a. If no such value exists, print -1.

Sample Input
6
7 1 3 4 1 7

Sample Output
3
*/
