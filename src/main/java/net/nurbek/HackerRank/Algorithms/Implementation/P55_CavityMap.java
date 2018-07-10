package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P55_CavityMap
{
    public static void main(String[] args)
    {
        String[] test = {"989", "191", "111"};
        System.out.println(Arrays.toString(cavityMap(test)));

        String[] test0 = {"1112", "1912", "1892", "1234"};
        System.out.println(Arrays.toString(cavityMap(test0)));
    }

    static String[] cavityMap(String[] grid)
    {
        for(int i = 1; i < grid.length - 1; i++)
        {
            for(int j = 1; j < grid[i].length() - 1; j++)
            {
                Character c = grid[i].charAt(j);
                Character cT = grid[i - 1].charAt(j);
                Character cB = grid[i + 1].charAt(j);
                Character cL = grid[i].charAt(j - 1);
                Character cR = grid[i].charAt(j + 1);

                if(cT == 'X' || cB == 'X' || cL == 'X' || cR == 'X') continue;

                if(c.charValue() > cT.charValue() && c.charValue() > cB.charValue() && c.charValue() > cL.charValue() && c.charValue() > cR.charValue())
                    grid[i] = grid[i].substring(0, j) + 'X' + grid[i].substring(j + 1);
            }
        }

        return grid;
    }
}

// SOLVED //

/*
You are given a square map as a matrix of integer strings. Each cell of the map has a value denoting its depth. We will
call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it
has strictly smaller depth. Two cells are adjacent if they have a common side, or edge.

Find all the cavities on the map and replace their depths with the uppercase character X.

For example, given a matrix:
989
191
111

You should return:
989
1X1
111

The center cell was deeper than those on its edges: [8,1,1,1]. The deep cells in the top two corners don't share an edge
with the center cell.

Input Format
The first line contains an integer n, the number of rows and columns in the map.
Each of the following n lines (rows) contains n positive digits without spaces (columns) representing depth at map[r,c].

Output Format
Output n lines, denoting the resulting map. Each cavity should be replaced with the character X.

Sample Input
4
1112
1912
1892
1234

Sample Output
1112
1X12
18X2
1234

Explanation
The two cells with the depth of 9 are not on the border and are surrounded on all sides by shallower cells. Their values
have been replaced by X.
*/