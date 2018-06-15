package net.nurbek.HackerRank.Algorithms.Implementation;

public class P31_AppendAndDelete
{
    public static void main(String[] args)
    {
        System.out.println(appendAndDelete("hackerhappy", "hackerrank", 9));
        System.out.println(appendAndDelete("ashley", "ash", 2));

        // Test #3 - Yes
        System.out.println(appendAndDelete("zzzzz", "zzzzzzz",4));

        // Test #5 - No
        System.out.println(appendAndDelete("y", "yu", 2));

        // Test #10 - No
        System.out.println(appendAndDelete("abcd", "abcdert", 10));
    }

    static String appendAndDelete(String s, String t, int k)
    {
        int operation = 0;
        boolean diff = false;

        if(t.length() > s.length() && (t.length() - s.length()) % 2 != 0)
            operation = t.length() + s.length();
        else
        {
            for (int i = 0; i < Math.max(s.length(), t.length()); i++)
            {
                if (i < s.length() && i < t.length())
                {
                    if (s.charAt(i) != t.charAt(i))
                        diff = true;

                    if (diff)
                        operation += 2;
                }
                else
                    operation++;
            }
        }

        return (k >= operation) ? "Yes" : "No";
    }
}

// SOLVED //

/*
You have a string of lowercase English alphabetic letters. You can perform two types of operations on the string:
1. Append a lowercase English alphabetic letter to the end of the string.
2. Delete the last character in the string. Performing this operation on an empty string results in an empty string.

Given an integer, "k", and two strings, "s" and "t", determine whether or not you can convert "s" to "t" by performing
exactly "k" of the above operations on "s". If it's possible, print Yes. Otherwise, print No.

For example, strings s = [a, b, c] and t = [d, e, f]. Our number of moves, k = 6. To convert s to t, we first delete all
of the characters in 3 moves. Next we add each of the characters of t in order. On the 6th move, you will have the
matching string. If there had been more moves available, they could have been eliminated by performing multiple deletions
on an empty string. If there were fewer than 6 moves, we would not have succeeded in creating the new string.

Input Format
The first line contains a string "s", the initial string.
The second line contains a string "t", the desired final string.
The third line contains an integer "k", the number of operations.

Output Format
Print Yes if you can obtain string t by performing exactly k operations on s. Otherwise, print No.

Sample Input
hackerhappy
hackerrank
9

Sample Output
Yes

Explanation 0

We perform 5 delete operations to reduce string s to hacker. Next, we perform 4 append operations (i.e., r, a, n, and k),
to get hackerrank. Because we were able to convert s to t by performing exactly k = 9 operations, we print Yes.

Sample Input 2
ashley
ash
2

Sample Output 2
No

Explanation 2
To convert ashley to ash a minimum of  steps are needed. Hence we print No as answer.
*/
