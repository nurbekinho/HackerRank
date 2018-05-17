package net.nurbek.HackerRank.Algorithms.Implementation;

public class P03_Kangaroo
{
    public static void main(String[] args)
    {
        System.out.println(kangaroo(0, 3, 4, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2)
    {
        return (x1 < x2 && v1 < v2) ? "NO" : (v1 != v2 && ((x2 - x1) % (v1 - v2)) == 0) ? "YES" : "NO";
    }
}

// SOLVED //

/*
You are choreograhing a circus show with various animals. For one act, you are given two kangaroos on a number line
ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location x[1] and moves at a rate of v[1] meters per jump.
The second kangaroo starts at location x[2] and moves at a rate of v[2] meters per jump.
You have to figure out a way to get both kangaroos at the same location as part of the show.

Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and return 'YES' or
'NO' appropriately. Can you determine if the kangaroos will ever land at the same location at the same time? The two
kangaroos must land at the same location after making the same number of jumps.

Input Format
A single line of four space-separated integers denoting the respective values of x[1], v[1], x[2], and v[2].

Constraints
* 0 <= x1 < x2 <= 10000
* 1 <= v1 <= 10000
* 1 <= v2 <= 10000

Output Format
Print YES if they can land on the same location at the same time; otherwise, print NO.
Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0
0 3 4 2

Sample Output 0
YES

Sample Input 1
0 2 5 3

Sample Output 1
NO
 */