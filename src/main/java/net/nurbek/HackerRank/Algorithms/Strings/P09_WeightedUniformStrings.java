package net.nurbek.HackerRank.Algorithms.Strings;

import java.util.*;

public class P09_WeightedUniformStrings
{
	public static void main(String[] args)
	{
        System.out.println(Arrays.toString(weightedUniformStrings("abccddde", new int[]{1, 3, 12, 5, 9, 10})));
	}

    static String[] weightedUniformStrings(String s, int[] queries)
    {
        Set<Integer> scores = new HashSet();
        int score = 0;
        char previous = ' ';

        for (int i = 0; i < s.length(); i++)
        {
            char current = s.charAt(i);
            if (current != previous) score = 0;
            score +=  current - 'a' + 1;
            scores.add(score);
            previous = current;
        }

        String[] result = new String[queries.length];
        for(int i = 0; i < queries.length; i++) result[i] = (scores.contains(queries[i])) ? "Yes" : "No";

        return result;
    }
}

// SOLVED //

/*
A weighted string is a string of lowercase English letters where each letter has a weight. Character weights are 1 to 26
from a to z as shown below:
a-1, b2, ..., z-26

We define the following terms:
* The weight of a string is the sum of the weights of all the string's characters. For example:
apple -> 1 + 16 + 16 + 12 + 5 = 50
* A uniform string consists of a single character repeated zero or more times. For example, "ccc" and "a" are uniform
* strings, but "bcb" and "cd" are not.

Given a string, "s", let "U" be the set of weights for all possible uniform contiguous substrings of string "s". You
have to answer "n" queries, where each query "i" consists of a single integer, x[i]. For each query, print "Yes" on a
new line if x[i] e U; otherwise, print "No" instead.

Input Format
The first line contains a string "s", the original string.
The second line contains an integer "n", the number of queries.
Each of the next "n" lines contains an integer x[i], the weight of a uniform substring of "s" that may or may not exist.

Output Format
Print "n" lines. For each query, print Yes on a new line if x[i] e U. Otherwise, print No.

Sample Input 0
abccddde
6
1
3
12
5
9
10

Sample Output 0
Yes
Yes
Yes
Yes
No
No
*/