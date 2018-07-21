package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Map;

public class P60_3DSurfaceArea
{
    public static void main(String[] args)
    {
        System.out.println(surfaceArea(new int[][]{{1}}));
        //System.out.println(surfaceArea(new int[][]{{1, 3, 4}, {2, 2, 3}, {1, 2, 4}}));
        //System.out.println(surfaceArea(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));

        // Test #!
        System.out.println(surfaceArea(new int[][]{{51, 32, 28, 49, 28, 21, 98, 56, 99, 77}}) == 1482);
    }

    private static int surfaceArea(int[][] A)
    {
        int area = 0;

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length; j++)
            {
                int cubes = A[i][j];

                if(cubes > 0) area += 2;

                for(int k = 0; k < cubes; k++)
                {
                    if(i - 1 < 0 || i == A.length - 1) area += 1;
                    if(j - 1 < 0 || j == A[i].length - 1) area += 1;
                }

                if(i + 1 < A.length && cubes != A[i + 1][j]) area += Math.abs(A[i + 1][j] - cubes);
                if(j + 1 < A[i].length && cubes != A[i][j + 1]) area += Math.abs(A[i][j + 1] - cubes);

                if(A.length == 1) area += cubes;
                if(A[i].length == 1) area += cubes;
            }
        }

        return area;
    }
}

// SOLVED //

/*
Madison, is a little girl who is fond of toys. Her friend Mason works in a toy manufacturing factory. Mason has a 2D
board "A" of size H x W with "H" rows and "W" columns. The board is divided into cells of size 1 x 1 with each cell
indicated by it's coordinate (i, j). The cell (i, j) has an integer A[ij] written on it. To create the toy Mason stacks
A[ij] number of cubes of size 1 x 1 x 1 on the cell (i, j).

Given the description of the board showing the values of A[ij] and that the price of the toy is equal to the 3d surface
area find the price of the toy.

Input Format
The first line contains two space-separated integers H and W the height and the width of the board respectively.
The next H lines contains W space separated integers. The j-th integer in i-th line denotes A[ij].

Output Format
Print the required answer, i.e the price of the toy, in one line.

Sample Input 0
1 1
1

Sample Output 0
6

Explanation 0
The surface area of 1 x 1 x 1 cube is 6.

Sample Input 1
3 3
1 3 4
2 2 3
1 2 4

Sample Output 1
60
*/