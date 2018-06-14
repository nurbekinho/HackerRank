package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P27_SequenceEquation
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(permutationEquation(new int[]{2, 3, 1})));
        System.out.println(Arrays.toString(permutationEquation(new int[]{5, 2, 1, 3, 4})));
    }

    static int[] permutationEquation(int[] p)
    {
        int[] result = new int[p.length];

        Map<Integer, Integer> valueIndexes = new HashMap();

        for(int i = 0; i < p.length; i++)
        {
            valueIndexes.put(p[i], i + 1);
        }

        for(int i = 1; i < p.length + 1; i++)
        {
            result[i-1] = valueIndexes.get(valueIndexes.get(i));
        }

        System.out.println(valueIndexes);

        return result;
    }
}

// SOLVED //

/*
You are given a sequence of "n" integers, p(1), p(2), ..., p(n). Each element in the sequence is distinct and satisfies
1 <= p(x) <= n. For each "x" where 1 <= x <= n, find any integer "y" such that p(p(y)) = x and print the value of "y" on
a new line.

For example, assume you have the sequence p = [5, 2, 1, 3, 4]. For each value of x between 1 and 5 we analyze as follows:
1. x = 1 = p[3], p[4] = 3, so p[p[4]] = 1
2. x = 2 = p[2], p[2] = 2, so p[p[2]] = 2
3. x = 3 = p[4], p[5] = 4, so p[p[5]] = 3
4. x = 4 = p[5], p[1] = 5, so p[p[1]] = 4
5. x = 5 = p[1], p[3] = 1, so p[p[3]] = 5

We find the values [4, 2, 5, 1, 3] for "y".

Input Format
The first line contains an integer "n", the number of elements in the sequence.
The second line contains "n" space-separated integers p[i] where 1 <= i <= n.

Output Format
For each x from 1 to n, print an integer denoting any valid y satisfying the equation p(p(y)) = x on a new line.

Sample Input
3
2 3 1

Sample Output
2
3
1
*/
