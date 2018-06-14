package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P26_CircularArrayRotation
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(circularArrayRotation(new int[]{1, 2, 3}, 2, new int[]{0, 1, 2})));
    }

    static int[] circularArrayRotation(int[] a, int k, int[] m)
    {
        int[] result = new int[m.length];

        for(int i = 0; i < m.length; i++)
        {
            int index = m[i] - k % a.length;
            result[i] = a[index < 0 ? a.length + index : index];
        }

        return result;
    }
}

// SOLVED //

/*
John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves
the last array element to the first position and shifts all remaining elements right one. To test Sherlock's abilities,
Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then
determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the value of the element at a given index.

For example, array a = [3, 4, 5], k = 2 and m = [1, 2].
First we perform the two rotations:
[3, 4, 5] -> [5, 3, 4] -> [4, 5, 3]
Now return the values from indexes 1 and 2 as indicated in the "m" array.
a[1] = 5
a[2] = 3

Input Format
The first line contains 3 space-separated integers, "n", "k", and "q", the number of elements in the integer array, the
rotation count and the number of queries.
The second line contains "n" space-separated integers, where each integer "i" describes array element a[i]
(where 0 <= i < n).
Each of the "q" subsequent lines contains a single integer denoting "m", the index of the element to return from "a".

Output Format
For each query, print the value of the element at index "m" of the rotated array on a new line.

Sample Input
3 2 3
1 2 3
0
1
2

Sample Output
2
3
1

Explanation
After the first rotation, the array becomes [3, 1, 2].
After the second (and final) rotation, the array becomes [2, 3, 1].

Let's refer to the array's final state as array b = [2, 3, 1]. For each query, we just have to print the value of b[m]
on a new line:
1. m = 0, b[0] = 2.
2. m = 1, b[1] = 3.
3. m = 2, b[2] = 1.
*/