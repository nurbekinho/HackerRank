package net.nurbek.HackerRank.Algorithms.Implementation;

import java.math.BigInteger;

public class P30_ExtraLongFactorials
{
    public static void main(String[] args)
    {
        extraLongFactorials(25);
    }

    static void extraLongFactorials(int n)
    {
        BigInteger bi = BigInteger.ONE;

        for(int i = 1; i <= n; i++)
        {
            bi = bi.multiply(BigInteger.valueOf(i));
        }

        System.out.println(bi);
    }
}

// SOLVED //

/*
The factorial of the integer "n", written "n!", is defined as:
n! = n * (n-1) * (n-2) * ... * 2 * 1

Calculate and print the factorial of a given integer.

Note: Factorials of n > 20 can't be stored even in a 64-bit long long variable. Big integers must be used for such
calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code
in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.

Input Format
Input consists of a single integer "n".

Constraints
* 1 <= n <= 100

Output Format
Print the factorial of n.

Sample Input
25

Sample Output
15511210043330985985984000000
*/