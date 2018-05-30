package net.nurbek.HackerRank.Algorithms.Strings;

public class P01_SuperReducedString
{
	public static void main(String[] args)
	{
		System.out.println(reduce("aaabccddd").equals("abd"));
	}

	public static String reduce(String s)
    {
        int i = 0;
        while (i < s.length() - 1)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                if(s.length() <= 2) return "Empty String";
                else s = s.substring(0, i) + s.substring(i+2);

                if(i > 0) i--;
            }
            else
                i++;
        }

        return (s.length() <= 0) ? "Empty String" : s;
    }
}

// SOLVED //

/*
Steve has a string of lowercase characters in range ascii[‘a’..’z’]. He wants to reduce the string to its shortest length
by doing a series of operations in which he selects a pair of adjacent lowercase letters that match, and then he deletes
them. For instance, the string "aab" could be shortened to "b" in one operation.

Steve’s task is to delete as many characters as possible using this method and print the resulting string. If the final
string is empty, print "Empty String".

Input Format
A single string, "s".

Constraints
* 1 <= n <= 100

Output Format
If the final string is empty, print "Empty String"; otherwise, print the final non-reducible string.

Sample Input 0
aaabccddd

Sample Output 0
abd
*/