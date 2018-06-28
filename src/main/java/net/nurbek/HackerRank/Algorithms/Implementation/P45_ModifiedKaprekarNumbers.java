package net.nurbek.HackerRank.Algorithms.Implementation;

public class P45_ModifiedKaprekarNumbers
{
    public static void main(String[] args)
    {
        kaprekarNumbers(2, 5);
        kaprekarNumbers(1, 100000);
    }

    private static void kaprekarNumbers(int p, int q)
    {
        boolean found = false;
        for(int i = p; i <= q; i++)
        {
            if(isKaprekar(i))
            {
                System.out.print(i + " ");
                found = true;
            }
        }

        if(!found) System.out.println("INVALID RANGE");
    }

    private static boolean isKaprekar(int number)
    {
        long nSquare = (long) Math.pow(number, 2);
        String nStr = Long.toString(nSquare);
        String firstHalf = nStr.substring(0, nStr.length() / 2);
        String secondHalf = nStr.substring(nStr.length() / 2, nStr.length());

        return (number == Integer.parseInt(firstHalf.length() > 0 ? firstHalf : "0") +
                Integer.parseInt(secondHalf.length() > 0 ? secondHalf : "0"));
    }
}

// SOLVED //

/*
A modified Kaprekar number is a positive whole number with a special property. If you square it, then split the number
into two integers and sum those integers, you have the same value you started with.

Consider a positive whole number "n" with "d" digits. We square "n" to arrive at a number that is either 2 * d digits
long or (2 * d) - 1 digits long. Split the string representation of the square into two parts, "l" and "r". The right
hand part, "r" must be "d" digits long. The left is the remaining substring. Convert those two substrings back to
integers, add them and see if you get "n".

For example, if n = 5, d = 1 then n² = 25. We split that into two strings and convert them back to integers 2 and 5.
We test 2 + 5 = 7 != 5, so this is not a modified Kaprekar number. If n = 9, still d = 1, and n² = 81. This gives
us 1 + 8 = 9, the original "n".

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!):
In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that
base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because
45² = 2025 and 20+25 = 45.

The Task
You are given the two positive integers "p" and "q" where "p" is lower than "q". Write a program to print the modified
Kaprekar numbers in the range between p and q, inclusive.

Input Format
The first line contains the lower integer limit p. The second line contains the upper integer limit q.

Note: Your range should be inclusive of the limits.

Output Format
Output each modified Kaprekar number in the given range, space-separated on a single line. If no modified Kaprekar
numbers exist in the given range, print INVALID RANGE.

Sample Input
1
100

Sample Output
1 9 45 55 99

Explanation
1, 9, 45, 55, and 99 are the Kaprekar Numbers in the given range.
*/