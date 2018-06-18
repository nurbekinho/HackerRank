package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.HashSet;
import java.util.Set;

public class P39_QueensAttackII
{
	public static void main(String[] args)
	{
		int[][] obstacles = {
				{2,4},
				{3,1},
				{5,5}
		};
		System.out.println(queensAttack(6, 3, 3, 3, obstacles));

        int[][] obstacles0 = {};
        System.out.println(queensAttack(4, 0, 4, 4, obstacles0));

        int[][] obstacles1 = {
                {5,5},
                {4,2},
                {2,3}
        };
        System.out.println(queensAttack(5, 3, 4, 3, obstacles1));
	}
	
	static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles)
	{
		Set<String> obstacleSet = new HashSet();
		for(int[] obstacle : obstacles)
		{
			String key = Integer.toString(obstacle[0]) + "-" + Integer.toString(obstacle[1]);
            obstacleSet.add(key);
		}
		
		int[][] queenDirections = {{0,1}, {1,0}, {0,-1}, {-1,0}, {1,1}, {-1,1}, {1,-1}, {-1,-1}};
		
		int attackedSquares = 0;
		
		for (int[] direction : queenDirections)
		{	
			int rQueen = r_q;
			int cQueen = c_q;
			
			while(true)
			{
				rQueen -= direction[0];
				cQueen -= direction[1];
				
				String newSquare = Integer.toString(rQueen) + "-" + Integer.toString(cQueen);
				
				if(rQueen < 1 || rQueen > n || cQueen < 1 || cQueen > n || obstacleSet.contains(newSquare))
					break;
				
				attackedSquares++;
			}
		}
		
		return attackedSquares;
    }
}

// SOLVED //

/*
You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares
the queen can attack.

A queen is standing on an "n x n" chessboard. The chess board's rows are numbered from 1 to n, going from bottom to top.
Its columns are numbered from 1 to n, going from left to right. Each square is referenced by a tuple, (r, c), describing
the row, "r", and column, "c", where the square is located.

The queen is standing at position (r[q], c[q]). In a single move, she can attack any square in any of the eight directions
(left, right, up, down, and the four diagonals). In the diagram below, the green circles denote all the cells the queen
can attack from (4, 4):
8 | | | |*| | | |*|
7 |*| | |*| | |*| |
6 | |*| |*| |*| | |
5 | | |*|*|*| | | |
4 |*|*|*|Q|*|*|*|*|
3 | | |*|*|*| | | |
2 | |*| |*| |*| | |
1 |*| | |*| | |*| |

There are obstacles on the chessboard, each preventing the queen from attacking any square beyond it on that path. For
example, an obstacle at location (3, 5) in the diagram above prevents the queen from attacking cells (3, 5), (2, 6),
and (1, 7):
8 | | | |*| | | |*|
7 |*| | |*| | |*| |
6 | |*| |*| |*| | |
5 | | |*|*|*| | | |
4 |*|*|*|Q|*|*|*|*|
3 | | |*|*|X| | | |
2 | |*| |*| | | | |
1 |*| | |*| | | | |

Given the queen's position and the locations of all the obstacles, find and print the number of squares the queen can
attack from her position at (r[q], c[q]).

Input Format
The first line contains two space-separated integers n and k, the length of the board's sides and the number of obstacles.
The next line contains two space-separated integers r[q] and c[q], the queen's row and column position.
Each of the next k lines contains two space-separated integers r[i] and c[i], the row and column position of obstacle[i].

Output Format
Print the number of squares that the queen can attack from position (r[q], c[q]).

Sample Input 0
4 0
4 4

Sample Output 0
9

Explanation 0
The queen is standing at position (4, 4) on a 4x4 chessboard with no obstacles:
4 |*|*|*|Q|
3 | | |*|*|
2 | |*| |*|
1 |*| | |*|
*/