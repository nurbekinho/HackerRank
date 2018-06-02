package net.nurbek.HackerRank.Algorithms.Implementation;

public class P21_UtopianTree
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(utopianTree(i));
        }
    }

    static int utopianTree(int n)
    {
        /*int h = 1;

        for(int i = 1; i <= n; i++)
        {
            h = (i % 2 == 0) ? h + 1 : h * 2;
        }

        return h;*/

        return ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2;
    }
}

// SOLVED //

/*
The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height
increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after "n"
growth cycles?

Input Format
The first line contains an integer, "t", the number of test cases.
"t" subsequent lines each contain an integer, "n", denoting the number of cycles for that test case.

Constraints
* 1 <= t <= 10
* 0 <= n <= 60

Output Format
For each test case, print the height of the Utopian Tree after "n" cycles. Each height must be printed on a new line.

Sample Input
3
0
1
4

Sample Output
1
2
7
*/