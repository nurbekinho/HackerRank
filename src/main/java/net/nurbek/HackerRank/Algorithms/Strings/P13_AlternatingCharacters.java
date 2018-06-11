package net.nurbek.HackerRank.Algorithms.Strings;

public class P13_AlternatingCharacters
{
    public static void main(String[] args)
    {
        System.out.println(3 == alternatingCharacters("BABABABAAAA"));
    }

    static int alternatingCharacters(String s)
    {
        int count = 0;

        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i+1)) count++;
        }

        return count;
    }
}

// SOLVED //

/*
You are given a string containing characters "A" and "B" only. Your task is to change it into a string such that every
two consecutive characters are different. To do this, you are allowed to delete one or more characters in the string.

Your task is to find the minimum number of required deletions.

Input Format
The first line contains an integer "t", the number of test cases.
The next "t" lines contain a string "s".

Constraints
* 1 <= t <= 10
* 1 <= |s| <= 10^5
* Each string "s" will consist only of characters "A" and "B"

Output Format
For each test case, print the minimum number of deletions required in a new line.

Sample Input
5
AAAA
BBBBB
ABABABAB
BABABA
AAABBB

Sample Output
3
4
0
0
4
*/