package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.*;

public class P53_FlatlandSpaceStations
{
    public static void main(String[] args)
    {
        System.out.println(flatlandSpaceStations(10, new int[]{6}) == 6);
        System.out.println(flatlandSpaceStations(6, new int[]{0, 1, 2, 3, 4}) == 1);
        System.out.println(flatlandSpaceStations(6, new int[]{0, 1, 2, 3, 4, 5}) == 0);
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}) == 2);

        // Test #2
        System.out.println(flatlandSpaceStations(20, new int[]{13, 1, 11, 10, 6}) == 6);
    }

    private static int flatlandSpaceStations(int n, int[] c)
    {
        int max = 0;

        if(n != c.length)
        {
            Arrays.sort(c);
            max = Math.max(c[0], n - c[c.length - 1] - 1);

            for(int i = 0; i < c.length - 1; i++)
            {
                max = Math.max(max, (c[i + 1] - c[i]) / 2);
            }
        }

        return max;
    }
}

// SOLVED //

/*
Flatland is a country with a number of cities, some of which have space stations. Cities are numbered consecutively and
each has a road of 1 km length connecting it to the next city. It is not a circular route, so the first city doesn't
connect with the last city. Determine the maximum distance from any city to it's nearest space station.

For example, there are n = 3 cities and m = 1 of them has a space station, city 1. They occur consecutively along a
route. City 2 is 2 - 1 = 1 unit away and city 3 is 3 - 1 = 2 units away. City 1 is 0 units from its nearest space
station as one is located there. The maximum distance is 2.

Input Format
The first line consists of two space-separated integers, n and m.
The second line contains m space-separated integers, the indices of each city having a space-station. These values are
unordered and unique.

Output Format
Print an integer denoting the maximum distance that an astronaut in a Flatland city would need to travel to reach the
nearest space station.

Sample Input 0
5 2
0 4

Sample Output 0
2

Explanation 0
This sample corresponds to following graphic:
(S)                             (S)
[0]-----[1]-----[2]-----[3]-----[4]

The distance to the nearest space station for each city is listed below:
* c[0] has distance 0 km, as it contains a space station.
* c[1] has distance 1 km to the space station in c[0].
* c[2] has distance 2 km to the space stations in c[0] and c[4].
* c[3] has distance 1 km to the space station in c[4].
* c[4] has distance 0 km, as it contains a space station.

We then take max(0, 1, 2, 1, 0) = 2.
*/