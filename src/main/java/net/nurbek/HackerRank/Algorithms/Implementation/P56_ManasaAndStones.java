package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P56_ManasaAndStones
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(stones(3, 1, 2)));
        System.out.println(Arrays.toString(stones(4, 10, 100)));

        // Test #3
        System.out.println(Arrays.toString(stones(58, 69, 24)));


    }

    private static int[] stones(int n, int a, int b)
    {
        int[] result = new int[n];
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if(min == max)
            return new int[]{((n - 1) * min)};

        for(int i = 0; i < n; i++)
            result[i] = (min * (n - i - 1) + max * i);

        return result;
    }
}

// SOLVED //

/*
Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail
and notices that any two consecutive stones' numbers differ by one of two values. Legend has it that there is a treasure
trove at the end of the trail. If Manasa can guess the value of the last stone, the treasure will be hers.

For example, assume she finds 2 stones and their differences are a = 2 or b = 3. We know she starts with a 0 stone not
included in her count. The permutations of differences for the two stones would be [2,2], [2,3], [3,2] or [3,3]. Looking
at each scenario, stones might have [2,4], [2,5], [3,5] or [3,6] on them. The last stone might have any of 4, 5, or 6 on
its face.

Compute all possible numbers that might occur on the last stone given a starting stone with a 0 on it, a number of
additional stones found, and the possible differences between consecutive stones. Order the list ascending.

Input Format
The first line contains an integer T, the number of test cases.

Each test case contains 3 lines:
- The first line contains n, the number of non-zero stones found.
- The second line contains a, one possible difference
- The third line contains b, the other possible difference.

Output Format
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Sample Input
2
3
1
2
4
10
100

Sample Output
2 3 4
30 120 210 300

Explanation
With differences 1 and 2, all possible series for the first test case are given below:
1. 0,1,2
2. 0,1,3
3. 0,2,3
4. 0,2,4
Hence the answer 2 3 4.

With differences 10 and 100, all possible series for the second test case are the following:
1. 0, 10, 20, 30
2. 0, 10, 20, 120
3. 0, 10, 110, 120
4. 0, 10, 110, 210
5. 0, 100, 110, 120
6. 0, 100, 110, 210
7. 0, 100, 200, 210
8. 0, 100, 200, 300
Hence the answer 30 120 210 300.
*/