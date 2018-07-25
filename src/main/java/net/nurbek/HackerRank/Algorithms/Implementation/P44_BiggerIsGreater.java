package net.nurbek.HackerRank.Algorithms.Implementation;

public class P44_BiggerIsGreater
{
    public static void main(String[] args)
    {
        System.out.println(biggerIsGreater("ab").equals("ba"));
        System.out.println(biggerIsGreater("bb").equals("no answer"));
        System.out.println(biggerIsGreater("hefg").equals("hegf"));
        System.out.println(biggerIsGreater("dhck").equals("dhkc"));
        System.out.println(biggerIsGreater("dkhc").equals("hcdk"));
    }

    private static String biggerIsGreater(String w)
    {
        char[] chars = w.toCharArray();

        int i = chars.length - 1;
        while(i > 0 && chars[i - 1] >= chars[i]) i--;

        if(i < 1) return "no answer";

        int j = chars.length - 1;
        while(chars[j] <= chars[i - 1]) j--;

        char temp = chars[i - 1];
        chars[i - 1] = chars[j];
        chars[j] = temp;

        j = chars.length - 1;
        while (i < j)
        {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }

        return String.valueOf(chars);
    }
}

// SOLVED //

/*
Lexicographical order is often known as alphabetical order when dealing with strings. A string is greater than another
string if it comes later in a lexicographically sorted list.

Given a word, create a new word by swapping some or all of its characters. This new word must meet two criteria:
* It must be greater than the original word
* It must be the smallest word that meets the first condition

Complete the function biggerIsGreater below to create and return the new string meeting the criteria. If it is not
possible, return "no answer".

Input Format
The first line of input contains "T", the number of test cases.
Each of the next "T" lines contains "w".

Output Format
For each test case, output the string meeting the criteria. If no answer exists, print "no answer".

Sample Input 0
5
ab
bb
hefg
dhck
dkhc

Sample Output 0
ba
no answer
hegf
dhkc
hcdk

Explanation 0
Test case 1:
ba is the only string which can be made by rearranging ab. It is greater.
Test case 2:
It is not possible to rearrange bb and get a greater string.
Test case 3:
hegf is the next string greater than hefg.
Test case 4:
dhkc is the next string greater than dhck.
Test case 5:
hcdk is the next string greater than dkhc.
*/