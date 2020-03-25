package net.nurbek.HackerRank.Algorithms.Greedy;

import java.util.Arrays;

public class P01_MinimumAbsoluteDifferenceInAnArray
{
    public static void main(String[] args) {
        System.out.println(minimumAbsoluteDifference(new int[]{1, -3, 71, 68, 17}));
    }

    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);

        int min = 1000000000;

        for(int i = 1; i < arr.length; i++) min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));

        return min;
    }
}

// SOLVED //

/*
Consider an array of integers, arr = [arr[0], arr[1], ..., arr[n - 1]]. We define the absolute difference between two
elements, a[i] and a[j] (where i != j), to be the absolute value of a[i] - a[j].

Given an array of integers, find and print the minimum absolute difference between any two elements in the array. For
example, given the array arr = [-2, 2, 4] we can create 3 pairs of numbers: [-2, 2], [-2, 4] and [2, 4]. The absolute
differences for these pairs are 4, 6 and 2. The minimum absolute difference is 2.

Input Format
The first line contains a single integer n, the size of arr.
The second line contains n space-separated integers arr[i].

Output Format
Print the minimum absolute difference between any two elements in the array.

Sample Input 0
3
3 -7 0

Sample Output 0
3

Explanation 0
With n = 3 integers in our array, we have three possible pairs: (3, -7), (3, 0), and (-7, 0). The absolute values of the
differences between these pairs are as follows: 10, 3, 7.

Notice that if we were to switch the order of the numbers in these pairs, the resulting absolute values would still be
the same. The smallest of these possible absolute differences is 3.

Sample Input 1
10
-59 -36 -13 1 -53 -92 -2 -96 -54 75

Sample Output 1
1

Explanation 1
The smallest absolute difference is |-54 - -53| = 1.

Sample Input 2
5
1 -3 71 68 17

Sample Output 2
3

Explanation 2
The minimum absolute difference is |71 - 68| = 3.
*/