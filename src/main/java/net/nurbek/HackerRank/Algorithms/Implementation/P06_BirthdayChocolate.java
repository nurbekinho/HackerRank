package net.nurbek.HackerRank.Algorithms.Implementation;

public class P06_BirthdayChocolate
{
    public static void main(String[] args)
    {
        int[] s1 = {1, 2, 1, 3, 2};
        int[] s2 = {1, 1, 1, 1, 1, 1};
        int[] s3 = {4};

        System.out.println(2 == solve(5, s1, 3, 2));
        System.out.println(0 == solve(6, s2, 3, 2));
        System.out.println(1 == solve(1, s3, 4, 1));
    }

    static int solve(int n, int[] s, int d, int m)
    {
        int solution = 0;

        for(int i = 0; i < n - m + 1; i++)
        {
            int sum = 0;
            for(int j = 0; j < m; j++)
            {
                sum += s[i + j];
            }

            if(sum == d)
                solution++;
        }

        return solution;
    }
}

// SOLVED //

/*
Lily has a chocolate bar that she wants to share it with Ron for his birthday. Each of the squares has an integer on it.
She decides to share a contiguous segment of the bar selected such that the length of the segment matches Ron's birth
month and the sum of the integers on the squares is equal to his birth day. You must determine how many ways she can
divide the chocolate.

Consider the chocolate bar as an array of squares, s = [2, 2, 1, 3, 2]. She wants to find segments summing to Ron's
birth day, d = 4 with a length equalling his birth month, m = 2. In this case, there are two segments meeting her
criteria: [2, 2] and [1, 3].

Input Format
The first line contains an integer 'n', the number of squares in the chocolate bar.
The second line contains 'n' space-separated integers s[i], the numbers on the chocolate squares where 0 <= i <= n.
The third line contains two space-separated integers, 'd' and 'm', Ron's birth day and his birth month.

Constraints
* 1 <= n <= 100
* 1 <= s[i] <= 5, where (0 <= i < n)
* 1 <= d <= 31
* 1 <= m <= 12

Output Format
Print an integer denoting the total number of ways that Lily can portion her chocolate bar to share with Ron.

Sample Input 0
5
1 2 1 3 2
3 2

Sample Output 0
2

Sample Input 1
6
1 1 1 1 1 1
3 2

Sample Output 1
0

Sample Input 2
1
4
4 1

Sample Output 2
1
*/
