package net.nurbek.HackerRank.Algorithms.Implementation;

public class P36_RepeatedString
{
    public static void main(String[] args)
    {
        System.out.println(repeatedString("aba", 10) == 7);
        System.out.println(repeatedString("a", 1000000000) == 1000000000);

        // Test #22
        System.out.println(repeatedString("ababa", 3) == 2);
    }

    static long repeatedString(String s, long n)
    {
        long count = 0;

        for(Character c : s.toCharArray())
        {
            if(c == 'a') count++;
        }

        if(n <= s.length())
        {
            count = 0;
            for(int i = 0; i < n; i++)
            {
                if(s.charAt(i) == 'a') count++;
            }

            return count;
        }
        else
        {
            if((n - s.length()) / s.length() > 0)
            {
                count *= (n - s.length()) / s.length() + 1;
            }

            for(int i = 0; i < (n - s.length()) % s.length(); i++)
            {
                if(s.charAt(i) == 'a') count++;
            }
        }

        return count;
    }
}

// SOLVED //

/*
Lilah has a string, "s", of lowercase English letters that she repeated infinitely many times.

Given an integer, "n", find and print the number of letter a's in the first "n" letters of Lilah's infinite string.

For example, if the string s = "abcac" and n = 10, the substring we consider is abcacabcac, the first 10 characters of
her infinite string. There are 4 occurrences of a in the substring.

Input Format
The first line contains a single string, s.
The second line contains an integer, n.

Output Format
Print a single integer denoting the number of letter a's in the first n letters of the infinite string created by
repeating s infinitely many times.

Sample Input 0
aba
10

Sample Output 0
7

Explanation 0
The first n = 10 letters of the infinite string are abaabaabaa. Because there are 7 a's, we print 7 on a new line.
*/