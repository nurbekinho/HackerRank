package net.nurbek.HackerRank.Algorithms.Implementation;

public class P16_FormingMagicSquare
{
	public static void main(String[] args)
	{
		int[][] s1 = {
				{4, 9, 2},
				{3, 5, 7},
				{8, 1, 5}
		};
		
		int[][] s2 = {
				{5, 3, 4},
				{1, 5, 8},
				{6, 4, 2}
		};
		
		System.out.println(1 == formingMagicSquare(s1));
		System.out.println(7 == formingMagicSquare(s2));
	}
	
	static int formingMagicSquare(int[][] s)
	{
		int result = 1000;
		
		int[][][] magicSquares = {
		               		{
		               			{8, 1, 6}, {3, 5, 7}, {4, 9, 2}
		               		},
		               		{
		               			{6, 1, 8}, {7, 5, 3}, {2, 9, 4}
		               		},
		               		{
		               			{4, 9, 2}, {3, 5, 7}, {8, 1, 6}
		               		},
		               		{
		               			{2, 9, 4}, {7, 5, 3}, {6, 1, 8} 
		               		},
		               		{
		               			{8, 3, 4}, {1, 5, 9}, {6, 7, 2}
		               		},
		               		{
		               			{4, 3, 8}, {9, 5, 1}, {2, 7, 6} 
		               		},
		               		{
		               			{6, 7, 2}, {1, 5, 9}, {8, 3, 4}
		               		},
		               		{
		               			{2, 7, 6}, {9, 5, 1}, {4, 3, 8}
		               		}
		};
		
		for(int[][] magicSquare : magicSquares)
		{
			int diff = 0;
			
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					diff += Math.abs(magicSquare[i][j] - s[i][j]);
				}
			}
			
			if(diff < result) result = diff;
		}
		
		return result;
    }
}

// SOLVED //

/*
We define a magic square to be an "n x n" matrix of distinct positive integers from 1 to n^2 where the sum of any row,
column, or diagonal of length n is always equal to the same number: the magic constant.
You will be given a 3 x 3 matrix "s" of integers in the inclusive range [1, 9]. We can convert any digit "a" to any
other digit "b" in the range [1, 9] at cost of [a - b]. Given "s", convert it into a magic square at minimal cost. Print
this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range [1, 9].

For example, we start with the following matrix "s":
5 3 4
1 5 8
6 4 2

We can convert it to the following magic square:
8 3 4
1 5 9
6 7 2

This took three replacements at a cost of |5-8| + |8-9| + |4-7| = 7.

Input Format
Each of the lines contains three space-separated integers of row s[i].

Constraints
* s[i][j] e [1,9]

Output Format
Print an integer denoting the minimum cost of turning matrix "s" into a magic square.

Sample Input 0
4 9 2
3 5 7
8 1 5

Sample Output 0
1

Explanation 0
If we change the bottom right value, s[2][2], from 5 to 6 at a cost of |6-5| = 1, "s" becomes a magic square at the
minimum possible cost.
*/