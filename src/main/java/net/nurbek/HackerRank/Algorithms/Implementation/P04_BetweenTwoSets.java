package net.nurbek.HackerRank.Algorithms.Implementation;

public class P04_BetweenTwoSets
{
    public static void main(String[] args)
    {
        int[] a = {2, 4};
        int[] b = {16, 32, 96};

        System.out.println(getTotalX(a, b));
    }

    static int getTotalX(int[] a, int[] b)
    {
        return 0;
    }
}

// NOT SOLVED //

/*
You will be given two arrays of integers. You will be asked to determine all integers that satisfy the following two
conditions:
1. The elements of the first array are all factors of the integer being considered
2. The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

Input Format
The first line contains two space-separated integers describing the respective values of n, the number of elements in
array a, and m, the number of elements in array b.
The second line contains n distinct space-separated integers describing a[0], a[1], ..., a[n-1].
The third line contains m distinct space-separated integers describing b[0], b[1], ..., b[m-1].

Constraints
* 1 <= n, m <= 10
* 1 <= a[i] <= 100
* 1 <= b[i] <= 100

Output Format
Print the number of integers that are considered to be between a and b.

Sample Input
2 3
2 4
16 32 96

Sample Output
3

Explanation
2 and 4 divide evenly into 4, 8, 12 and 16.
4, 8 and 16 divide evenly into 16, 32, 96.
4, 8 and 16 are the only three numbers for which each element of A is a factor and each is a factor of all elements of B.
*/
