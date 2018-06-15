package net.nurbek.HackerRank.Algorithms.Implementation;

public class P29_FindDigits
{
    public static void main(String[] args)
    {
        System.out.println(findDigits(12));
        System.out.println(findDigits(1012));
    }

    static int findDigits(int n)
    {
        int count = 0;

        for(Character c : Integer.toString(n).toCharArray())
        {
            int digit = Integer.parseInt(String.valueOf(c));
            if(digit > 0 && n % digit == 0) count++;
        }

        return count;
    }
}

// SOLVED //

/*
An integer "d" is a divisor of an integer "n" if the remainder of n / d = 0.

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of
divisors occurring within the integer.

Note: Each digit is considered to be unique, so each occurrence of the same digit should be counted (e.g. for n = 111,
1 is a divisor of 111 each time it occurs so the answer is 3).

Input Format
The first line is an integer, "t", indicating the number of test cases.
The "t" subsequent lines each contain an integer, "n".

Output Format
For every test case, count the number of digits in "n" that are divisors of "n". Print each answer on a new line.

Sample Input
2
12
1012

Sample Output
2
3

Explanation
The number 12 is broken into two digits, 1 and 2. When 12 is divided by either of those two digits, the remainder is 0
so they are divisors.
The number 1012 is broken into four digits, 1, 0, 1, and 2. 1012 is evenly divisible by its digits 1, 1, and 2, but it
is not divisible by 0 as division by zero is undefined.
*/