package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P51_ServiceLane
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(serviceLane(8, new int[]{2, 3, 1, 2, 3, 2, 3, 3}, new int[][]{
                {0, 3},
                {4, 6},
                {6, 7},
                {3, 5},
                {0, 7}
        })));
    }

    static int[] serviceLane(int n, int[] width, int[][] cases)
    {
        int[] result = new int[cases.length];

        for(int i = 0; i < cases.length; i++)
        {
            result[i] = 3;
            for(int j = cases[i][0]; j <= cases[i][1]; j++)
            {
                result[i] = Math.min(result[i], width[j]);
            }
        }

        return result;
    }
}

// SOLVED //

/*
Calvin is driving his favorite vehicle on the 101 freeway. He notices that the check engine light of his vehicle is on,
and he wants to service it immediately to avoid any risks. Luckily, a service lane runs parallel to the highway. The
service lane varies in width along its length.
 Highway  Service lane
|   |   | |
|       |  |
|   |   |  |
|       |   |
|   |   |  |

You will be given an array of widths at points along the road (indexes), then a list of the indexes of entry and exit
points. Considering each entry and exit point pair, calculate the maximum size vehicle that can travel that segment of
the service lane safely.

Complete the code stub below to return an array of integers representing the values calculated.

Input Format
The first line of input contains two integers, "n" and "t", where "n" denotes the number of width measurements you will
receive and "t" the number of test cases. The next line has "n" space-separated integers which represent the array
width[w[0], w[1], ..., w[n-1].

The next "t" lines contain two integers, "i" and "j", where "i" is the start index and "j" is the end index of the
segment being considered.

Output Format
For each test case, print the number that represents the largest vehicle type that can pass through the entire segment
of the service lane between indexes "i" and "j" inclusive.

Sample Input
8 5
2 3 1 2 3 2 3 3
0 3
4 6
6 7
3 5
0 7

Sample Output
1
2
3
2
1

Explanation
Below is the representation of the lane:
   |HIGHWAY|Lane|    ->    Width

0: |       |--|            2
1: |       |---|           3
2: |       |-|             1
3: |       |--|            2
4: |       |---|           3
5: |       |--|            2
6: |       |---|           3
7: |       |---|           3
*/
