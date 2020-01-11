package net.nurbek.HackerRank.Algorithms.Strings;

public class P15_TheLoveLetterMystery
{
    public static void main(String[] args)
    {
        System.out.println(4 == theLoveLetterMystery("abcd"));
        System.out.println(0 == theLoveLetterMystery("abcba"));
    }

    static int theLoveLetterMystery(String s)
    {
        int operations = 0;

        for(int i = 0; i < s.length() / 2; i++)
        {
            operations += Math.abs((int) s.charAt(i) - (int) s.charAt(s.length() - i - 1));
        }

        return operations;
    }
}

// SOLVED //

/*
James found a love letter that his friend Harry has written to his girlfriend. James is a prankster, so he decides to
meddle with the letter. He changes all the words in the letter into palindromes.

To do this, he follows two rules:
1. He can only reduce the value of a letter by 1, i.e. he can change d to c, but he cannot change c to d or d to b.
2. The letter a may not be reduced any further.

Each reduction in the value of any letter is counted as a single operation. Find the minimum number of operations
required to convert a given string into a palindrome.

Input Format
The first line contains an integer "q", the number of queries.
The next "q" lines will each contain a string "s".

Output Format
A single line containing the number of minimum operations corresponding to each test case.

Sample Input
4
abc
abcba
abcd
cba

Sample Output
2
0
4
2

Explanation
1. For the first test case, abc -> abb -> aba.
2. For the second test case, abcba is already a palindromic string.
3. For the third test case, abcd -> abcc -> abcb -> abca = abca -> abba.
4. For the fourth test case, cba -> bba -> aba.
*/