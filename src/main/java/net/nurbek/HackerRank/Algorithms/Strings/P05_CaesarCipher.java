package net.nurbek.HackerRank.Algorithms.Strings;

public class P05_CaesarCipher
{
    public static void main(String[] args)
    {
        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz", 1).equals("bcdefghijklmnopqrstuvwxyza"));
    }

    static String caesarCipher(String s, int k)
    {
        String result = "";

        for(Character c : s.toCharArray())
        {
            if(Character.isAlphabetic(c))
            {
                int aIndex = Character.isUpperCase(c) ? (int) 'A' : (int) 'a';
                result += (char) (aIndex + ((int) c - aIndex + k) % 26);
            }
            else
                result += c;
        }

        return result;
    }
}

// SOLVED //

/*
Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each
letter by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front
of the alphabet. In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.
Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format
The first line contains the integer, "n", the length of the unencrypted string.
The second line contains the unencrypted string, "s".
The third line contains "k", the number of letters to rotate the alphabet by.

Constraints
* 1 <= n <= 100
* 0 <= k <= 100
"s" is a valid ASCII string without any spaces.

Output Format
For each test case, print the encoded string.

Sample Input
11
middle-Outz
2

Sample Output
okffng-Qwvb

Explanation
Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +2:    cdefghijklmnopqrstuvwxyzab
*/