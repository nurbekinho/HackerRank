package net.nurbek.HackerRank.Algorithms.Strings;

public class P02_CamelCase
{
    public static void main(String[] args)
    {
        System.out.println(5 == camelcase("saveChangesInTheEditor"));
    }

    static int camelcase(String s)
    {
        int count = 1;

        for(int i = 1; i < s.length(); i++)
        {
            if(Character.isUpperCase(s.charAt(i))) count++;
        }

        return count;
    }
}

// SOLVED //

/*
Alice wrote a sequence of words in CamelCase as a string of letters, "s", having the following properties:
* It is a concatenation of one or more words consisting of English letters.
* All letters in the first word are lowercase.
* For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.

Given "s", print the number of words in "s" on a new line.

Input Format
A single line containing string "s".

Constraints
* 1 <= |s| <= 10^5

Output Format
Print the number of words in string .

Sample Input
saveChangesInTheEditor

Sample Output
5
*/