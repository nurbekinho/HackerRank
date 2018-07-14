package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.List;

public class P57_TheGridSearch
{
    public static void main(String[] args)
    {
        System.out.println(getIndexes("111111111111111", "11111"));

        String[] s1 = {"1234567890", "0987654321", "0987654321", "1111111111", "1111111111", "2222222222"};
        String[] p1 = {"876543", "111111", "111111"};
        System.out.println(gridSearch(s1, p1));

        String[] s2 = {"400453592126560", "114213133098692", "474386082879648", "522356951189169", "887109450487496",
                "252802633388782", "502771484966748", "075975207693780", "511799789562806", "404007454272504",
                "549043809916080", "962410809534811", "445893523733475", "768705303214174", "650629270887160"};
        String[] p2 = {"99", "99"};
        System.out.println(gridSearch(s2, p2));

        // Test #9
        String[] s9 = {"111111111111111", "111111111111111", "111111011111111", "111111111111111", "111111111111111"};
        String[] p9 = {"11111", "11111", "11110"};
        System.out.println(gridSearch(s9, p9));

        // Test #13
        String[] s13 = {"123456", "567890", "234567", "194729"};
        String[] p13 = {"2345", "6789", "3456", "9472"};
        System.out.println(gridSearch(s13, p13));
    }

    private static String gridSearch(String[] G, String[] P)
    {
        for(int i = 0; i <= G.length - P.length; i++)
        {
            if (G[i].contains(P[0]))
            {
                if (P.length == 1) return "YES";

                for (int index : getIndexes(G[i], P[0]))
                {
                    boolean allMatches = true;

                    for (int j = 0; j < P.length; j++)
                    {
                        String subG = G[i + j].substring(index, index + P[j].length());
                        if (!subG.equals(P[j]))
                        {
                            allMatches = false;
                            break;
                        }
                    }

                    if (allMatches) return "YES";
                }
            }
        }

        return "NO";
    }

    private static List<Integer> getIndexes(String s, String p)
    {
        List<Integer> indexes = new ArrayList();

        for(int i = 0; i <= s.length() - p.length(); i++)
        {
            if(s.substring(i, i + p.length()).equals(p))
                indexes.add(i);
        }

        return indexes;
    }
}

//

/*
Given a 2D array of digits or grid, try to find the occurrence of a given 2D pattern of digits. For example, consider
the following grid:
1234567890
0987654321
1111111111
1111111111
2222222222

Assume we need to look for the following 2D pattern array:
876543
111111
111111

The 2D pattern begins at the second row and the third column of the grid. The pattern is said to be present in the grid.

Input Format
The first line contains an integer t, the number of test cases.
Each of the t test cases is represented as follows:
The first line contains two space-separated integers R and C, indicating the number of rows and columns in the grid G.
This is followed by R lines, each with a string of C digits representing the grid G.
The following line contains two space-separated integers, r and c, indicating the number of rows and columns in the
pattern grid P.
This is followed by r lines, each with a string of c digits representing the pattern P.

Output Format
Display 'YES' or 'NO', depending on whether p is present in G.

Sample Input
2
10 10
7283455864
6731158619
8988242643
3830589324
2229505813
5633845374
6473530293
7053106601
0834282956
4607924137
3 4
9505
3845
3530
15 15
400453592126560
114213133098692
474386082879648
522356951189169
887109450487496
252802633388782
502771484966748
075975207693780
511799789562806
404007454272504
549043809916080
962410809534811
445893523733475
768705303214174
650629270887160
2 2
99
99

Sample Output
YES
NO

Explanation
The first test in the input file is:
10 10
7283455864
6731158619
8988242643
3830589324
2229505813
5633845374
6473530293
7053106601
0834282956
4607924137
3 4
9505
3845
3530

As one may see, the given pattern is present in the larger grid, as marked in bold below.
7283455864
6731158619
8988242643
3830589324
222    813
563    374
647    293
7053106601
0834282956
4607924137

The second test in the input file is:
15 15
400453592126560
114213133098692
474386082879648
522356951189169
887109450487496
252802633388782
502771484966748
075975207693780
511799789562806
404007454272504
549043809916080
962410809534811
445893523733475
768705303214174
650629270887160
2 2
99
99

The search pattern is:
99
99

This cannot be found in the larger grid.
*/