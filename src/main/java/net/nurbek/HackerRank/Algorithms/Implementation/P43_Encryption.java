package net.nurbek.HackerRank.Algorithms.Implementation;

public class P43_Encryption
{
    public static void main(String[] args)
    {
        System.out.println(encryption("if man was meant to stay on the ground god would have given us roots"));
        System.out.println(encryption("feed the dog"));

        // Test #4
        System.out.println(encryption("iffactsdontfittotheorychangethefacts"));
    }

    static String encryption(String s)
    {
        s = s.replaceAll(" ", "");

        int n = (int) Math.floor(Math.sqrt(s.length()));
        int m = (int) Math.ceil(Math.sqrt(s.length()));

        if(n == m) n--;

        String result = "";

        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int index = i + j * m;
                if(index < s.length()) result += s.charAt(index);
            }

            if(i < n) result += " ";
        }

        return result;
    }
}

// SOLVED //

/*
An English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let "L" be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:
Floor(Sqrt(L)) <= row <= column <= Ceil(Sqrt(L))

For example, the sentence "if man was meant to stay on the ground god would have given us roots" after removing spaces is
54 characters long. Sqrt(54) is between 7 and 8, so it is written in the form of a grid with 7 rows and 8 columns.
ifmanwas
meanttos
tayonthe
groundgo
dwouldha
vegivenu
sroots

* Ensure that rows x columns >= L
* If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows x columns.
The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next
column and inserting a space, and so on. For example, the encoded message for the above rectangle is:
imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message to encode and print.

Input Format
One line of text, the string s.

Output Format
Print the encoded message on one line as described.

Sample Input
haveaniceday

Sample Output:
hae and via ecy

Explanation:
L = 12, Sqrt(12) is between 3 and 4 rewritten with 3 row and 4 columns:
have
anic
eday
*/
