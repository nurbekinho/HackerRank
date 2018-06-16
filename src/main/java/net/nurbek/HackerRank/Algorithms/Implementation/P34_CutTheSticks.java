package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P34_CutTheSticks
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(cutTheSticks(new int[]{5, 4, 4, 2, 2, 8, 8, 9})));
        System.out.println(Arrays.toString(cutTheSticks(new int[]{1, 2, 3, 4, 3, 3, 2, 1})));
    }

    static int[] cutTheSticks(int[] arr)
    {
        Arrays.sort(arr);
        List<Integer> numbers = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> numberOfCuts = new ArrayList();

        while(numbers.size() > 0)
        {
            int min = numbers.get(0);

            numberOfCuts.add(numbers.size());

            for(int i = 0; i < numbers.size(); i++)
            {
                if(numbers.get(i) - min == 0)
                {
                    numbers.remove(i);
                    i--;
                }
                else
                    break;
            }
        }

        int[] cuts = new int[numberOfCuts.size()];
        for(int i = 0; i < numberOfCuts.size(); i++) cuts[i] = numberOfCuts.get(i);

        return cuts;
    }
}

// SOLVED //

/*
You are given a number of sticks of varying lengths. You will iteratively cut the sticks into smaller sticks, discarding
the shortest pieces until there are none left. At each iteration you will determine the length of the shortest stick
remaining, cut that length from each of the longer sticks and then discard all the pieces of that shortest length. When
all the remaining sticks are the same length, they cannot be shortened so discard them.

Given the lengths of "n" sticks, print the number of sticks that are left before each iteration until there are none left.

Note: Before each iteration you must determine the current shortest stick.

Input Format
The first line contains a single integer "n".
The next line contains "n" space-separated integers: a[0], a[1], ..., a[n-1], where a[i] represents the length of the i-th
stick in array arr.

Output Format
For each operation, print the number of sticks that are cut, on separate lines.

Sample Input 0
6
5 4 4 2 2 8

Sample Output 0
6
4
2
1

Explanation 0
sticks-length        length-of-cut   sticks-cut
5 4 4 2 2 8             2               6
3 2 2 _ _ 6             2               4
1 _ _ _ _ 4             1               2
_ _ _ _ _ 3             3               1
_ _ _ _ _ _           DONE            DONE

Sample Input 1
8
1 2 3 4 3 3 2 1

Sample Output 1
8
6
4
1

Explanation 0
sticks-length         length-of-cut   sticks-cut
1 2 3 4 3 3 2 1         1               8
_ 1 2 3 2 2 1 _         1               6
_ _ 1 2 1 1 _ _         1               4
_ _ _ 1 _ _ _ _         1               1
_ _ _ _ _ _ _ _       DONE            DONE
*/