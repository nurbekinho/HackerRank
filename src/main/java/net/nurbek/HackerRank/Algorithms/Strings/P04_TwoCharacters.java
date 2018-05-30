package net.nurbek.HackerRank.Algorithms.Strings;

public class P04_TwoCharacters
{
    public static void main(String[] args)
    {
        System.out.println(5 == twoCharacters("beabeefeab"));
        //System.out.println(5 == twoCharacters("abaebabebebfbeabb"));
    }

    static int twoCharacters(String s)
    {
        int i = 0;
        while(i < s.length() - 1)
        {
            String c1 = Character.toString(s.charAt(i));
            String c2 = Character.toString(s.charAt(i+1));

            if(c1.equals(c2))
            {
                s = s.replaceAll(c1, "");
                i = 0;
            }

            i++;
        }

        if(s.length() < 1) return 0;

        return 0;
    }
}

// NOT SOLVED //

/*
In this challenge, you will be given a string. You must remove characters until the string is made up of any two
alternating characters. When you choose a character to remove, all instances of that character must be removed. Your
goal is to create the longest string possible that contains just two alternating letters.

As an example, consider the string "abaacdabd". If you delete the character a, you will be left with the string "bcdbd".
Now, removing the character c leaves you with a valid string "bdbd" having a length of 4. Removing either b or d at any
point would not result in a valid string.

Given a string "s", convert it to the longest possible string "t" made up only of alternating characters. Print the
length of string "t" on a new line. If no string "t" can be formed, print 0 instead.

Input Format
The first line contains a single integer denoting the length of "s".
The second line contains string "s".

Constraints
* 1 <= |s| <= 1000
* s[i] e [a-z]

Output Format
Print a single integer denoting the maximum length of "t" for the given "s"; if it is not possible to form string "t",
print 0 instead.

Sample Input
10
beabeefeab

Sample Output
5

Explanation
The characters present in "s" are a, b, e, and f. This means that "t" must consist of two of those characters and we
must delete two others. Our choices for characters to leave are [a,b], [a,e], [a, f], [b, e], [b, f] and [e, f].

If we delete "e" and "f", the resulting string is "babab". This is a valid "t" as there are only two distinct characters
(a and b), and they are alternating within the string.

If we delete "a" and "f", the resulting string is "bebeeeb". This is not a valid string "t" because there are consecutive
e's present. Removing them would leave consecutive b's, so this fails to produce a valid string "t".

Other cases are solved similarly.

"babab" is the longest string we can create.
*/