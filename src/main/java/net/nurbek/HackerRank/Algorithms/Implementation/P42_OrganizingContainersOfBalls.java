package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.HashSet;
import java.util.Set;

public class P42_OrganizingContainersOfBalls
{
    public static void main(String[] args)
    {
        //int[][] container1 = {{1, 1}, {1, 1}};
        //int[][] container2 = {{0, 2}, {1, 1}};

        // Test #1
        int[][] container1 = {{999336263, 998799923}, {998799923, 999763019}};
        int[][] container2 = {
                {997612619, 934920795, 998879231, 999926463},
                {960369681, 997828120, 999792735, 979622676},
                {999013654, 998634077, 997988323, 958769423},
                {997409523, 999301350, 940952923, 993020546}
        };

        System.out.println(organizingContainers(container1));
        System.out.println(organizingContainers(container2));
    }

    static String organizingContainers(int[][] container)
    {
        Set<Long> result = new HashSet();

        for(int i = 0; i < container.length; i++)
        {
            long totalTypes = 0;
            long totalInContainer = 0;

            for(int j = 0; j < container.length; j++)
            {
                totalTypes += container[j][i];
                totalInContainer += container[i][j];
            }

            if(result.contains(totalTypes)) result.remove(totalTypes);
            else result.add(totalTypes);

            if(result.contains(totalInContainer)) result.remove(totalInContainer);
            else result.add((totalInContainer));
        }

        return result.size() > 0 ? "Impossible" : "Possible";
    }
}

// SOLVED //

/*
David has several containers, each with a number of balls in it. He has just enough containers to sort each type of ball
he has into its own container. David wants to sort the balls using his sort method.

As an example, David has n = 2 containers and 2 different types of balls, both of which are numbered from 0 to n - 1 = 1.
The distribution of ball types per container are described by an n x n matrix of integers, M[container][type].
For example, consider the following diagram for M = [[1,4], [2,3]]:
Before swap:
Matrix M
     Types
C    0 1
o 0 |1|4|
n 1 |2|3|

Container 0: [0, 1, 1, 1, 1]
Container 1: [0, 0, 1, 1, 1]

After swap:
Matrix M
     Types
C    0 1
o 0 |2|3|
n 1 |1|4|
Container 0: [0, 0, 1, 1, 1]
Container 1: [0, 1, 1, 1, 1]

David wants to perform some number of swap operations such that:
* Each container contains only balls of the same type.
* No two balls of the same type are located in different containers.

You must perform "q" queries where each query is in the form of a matrix, M. For each query, print Possible on a new line
if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.

Input Format
The first line contains an integer q, the number of queries.

Each of the next q sets of lines is as follows:
1. The first line contains an integer n, the number of containers (rows) and ball types (columns).
2. Each of the next n lines contains n space-separated integers describing row M[i].

Output Format
For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise,
print Impossible.

Sample Input 0
2
2
1 1
1 1
2
0 2
1 1

Sample Output 0
Possible
Impossible
*/