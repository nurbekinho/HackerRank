package net.nurbek.HackerRank.Algorithms.Implementation;

public class P32_SherlockAndSquares
{
    public static void main(String[] args)
    {
        System.out.println(squares(3, 9));
        System.out.println(squares(17, 24));
    }

    static int squares(int a, int b)
    {
        int count = 0;
        double minSqrt = Math.floor(Math.sqrt(a));

        while(true)
        {
            double sqr = Math.pow(minSqrt, 2);
            if(sqr >= a && sqr <= b)
                count++;
            else if(sqr > b)
                break;
            minSqrt++;
        }

        return count;
    }
}

// SOLVED //

/*
Watson likes to challenge Sherlock's math ability. He will provide a starting and ending value describing a range of
integers. Sherlock must determine the number of square integers within that range, inclusive of the endpoints.

Note: A square integer is an integer which is the square of an integer, e.g. 1, 4, 9, 16, 25.

Input Format
The first line contains "T", the number of test cases.
Each of the next "T" lines contains two space-separated integers denoting "A" and "B", the starting and ending integers
in the ranges.

Output Format
For each test case, print the number of square integers in the range on a new line.

Sample Input
2
3 9
17 24

Sample Output
2
0
*/
