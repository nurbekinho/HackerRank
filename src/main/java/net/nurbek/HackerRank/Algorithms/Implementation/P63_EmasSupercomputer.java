package net.nurbek.HackerRank.Algorithms.Implementation;

import java.awt.Point;
import java.util.*;

public class P63_EmasSupercomputer
{
    public static void main(String[] args)
    {
        System.out.println(twoPluses(new String[]{  "GGGGGG",
                                                    "GBBBGB",
                                                    "GGGGGG",
                                                    "GGBBGB",
                                                    "GGGGGG"}));

        System.out.println(twoPluses(new String[]{  "GBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "GGGGGGGGGGGGGGG",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB",
                                                    "BBBBBBBGBBBBBBB"}));

        System.out.println(twoPluses(new String[]{  "GBGBGGB",
                                                    "GBGBGGB",
                                                    "GBGBGGB",
                                                    "GGGGGGG",
                                                    "GGGGGGG",
                                                    "GBGBGGB",
                                                    "GBGBGGB"}));
    }

    static int twoPluses(String[] grid)
    {
        int minSize = Math.min(grid.length, grid[0].length());

        List<Map<Integer, Point>> pluses = new ArrayList();

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length(); j++)
            {
                if(grid[i].charAt(j) == 'G')
                {
                    Point p = new Point(i, j);
                    Map<Integer, Point> plus = new HashMap();
                    plus.put(1, p);
                    pluses.add(0, plus);

                    for(int k = 1; k < minSize / 2 + 1; k++)
                    {
                        if(i - k >= 0 && grid[i - k].charAt(j) == 'G' &&
                            i + k < grid.length && grid[i + k].charAt(j) == 'G' &&
                            j - k >= 0 && grid[i].charAt(j - k) == 'G' &&
                            j + k < grid[i].length() && grid[i].charAt(j + k) == 'G')
                        {
                            plus = new HashMap();
                            plus.put(1 + 4 * k, p);
                            pluses.add(pluses.size(), plus);
                        }
                        else
                            break;
                    }
                }
            }
        }

        if(pluses.size() <= 1) return 0;

        int max = 1;

        for(int i = pluses.size() - 1; i > 0; i--)
        {
            for(int j = i - 1; j >= 0; j--)
            {
                int areaI = pluses.get(i).keySet().iterator().next();
                Point pI = pluses.get(i).values().iterator().next();

                int areaJ = pluses.get(j).keySet().iterator().next();
                Point pJ = pluses.get(j).values().iterator().next();

                if(!pI.equals(pJ) && areaI > 1 || areaJ > 1)
                {
                    Set<Point> iSet = new HashSet();
                    iSet.add(pI);

                    Set<Point> jSetOverlap = new HashSet();
                    jSetOverlap.add(pJ);
                    addSides(pJ, jSetOverlap, 1);

                    for(int n = 1; n < areaI / 4 + 1; n++)
                    {
                        addSides(pI, iSet, n);
                    }

                    for(int m = 1; m < areaJ / 4 + 1; m++)
                    {
                        addSides(pJ, jSetOverlap, m);
                    }

                    boolean overlapExists = false;

                    for(Point iP : iSet)
                    {
                        if(jSetOverlap.contains(iP))
                        {
                            overlapExists = true;
                            break;
                        }
                    }

                    if(!overlapExists) max = Math.max(max, areaI * areaJ);
                }
            }
        }

        return max;
    }

    private static void addSides(Point point, Set<Point> pointSet, int range)
    {
        pointSet.add(new Point(point.x + range, point.y));
        pointSet.add(new Point(point.x - range, point.y));
        pointSet.add(new Point(point.x, point.y + range));
        pointSet.add(new Point(point.x, point.y - range));
    }
}

// SOLVED //

/*
ma built a quantum computer! Help her test its capabilities by solving the problem below.

Given a grid of size n x n, each cell in the grid is either "good" or "bad".

A valid plus is defined here as the crossing of two segments (horizontal and vertical) of equal lengths. These lengths
must be odd, and the middle cell of its horizontal segment must cross the middle cell of its vertical segment.

In the diagram below, the blue pluses are valid and the orange ones are not valid.
     _
    |_|            _
 _ _|_|_ _       _|_|_       _
|_|_|_|_|_|     |_|_|_|     |_|
    |_|           |_|
    |_|
   _             _           _
 _|_|_ _       _|_|_ _      |_|_ _
|_|_|_|_|     |_|_|_|_|     |_|_|_|
  |_|           |_|         |_|
  |_|

Find the two largest valid pluses that can be drawn on "good" cells in the grid, and return an integer denoting the
maximum product of their areas. In the above diagrams, our largest pluses have areas of 5 and 9. The product of their
areas is 5 x 9 = 45.

Note: The two pluses cannot overlap, and the product of their areas should be maximal.

Input Format
The first line contains two space-separated integers, n and m.
Each of the next n lines contains a string of m characters where each character is either G (good) or B (bad). These
strings represent the rows of the grid. If the y-th character in the x-th line is G, then (x, y) is a "good" cell.
Otherwise it's a "bad" cell.

Output Format
Find 2 pluses that can be drawn on "good" cells of the grid, and return an integer denoting the maximum product of their
areas.

Sample Input 0
5 6
GGGGGG
GBBBGB
GGGGGG
GGBBGB
GGGGGG

Sample Output 0
5

Sample Input 1
6 6
BGBBGB
GGGGGG
BGBBGB
GGGGGG
BGBBGB
BGBBGB

Sample Output 1
25
*/