package net.nurbek.HackerRank.Java.Advanced;

import java.io.IOException;

public class P10_JavaLambdaExpressions
{
    public static void main(String[] args) throws IOException
    {
        MyMath ob = new MyMath();
        int T = 3;
        PerformOperation op;
        boolean ret = false;
        String ans = null;

        op = ob.isOdd();
        ret = ob.checker(op, 5);
        ans = (ret) ? "ODD" : "EVEN";
        System.out.println(ans);

        op = ob.isPrime();
        ret = ob.checker(op, 13);
        ans = (ret) ? "PRIME" : "COMPOSITE";
        System.out.println(ans);

        op = ob.isPalindrome();
        ret = ob.checker(op, 121);
        ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
        System.out.println(ans);
    }
}

interface PerformOperation
{
    boolean check(int a);
}

class MyMath
{
    public static boolean checker(PerformOperation p, int num)
    {
        return p.check(num);
    }

    public static PerformOperation isOdd()
    {
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime()
    {
        return (int a) -> checkPrime(a);
    }

    public static PerformOperation isPalindrome()
    {
        return (int a) -> checkPalindrome(a);
    }

    private static boolean checkPrime(int number)
    {
        if(number == 2) return true;
        if(number < 2 || number % 2 == 0) return false;

        for(int i = 3; i < Math.sqrt(number) + 1; i++)
        {
            if(number % i == 0) return false;
        }

        return true;
    }

    private static boolean checkPalindrome(int number)
    {
        String n = Integer.toString(number);
        return n.equals(new StringBuilder(n).reverse().toString());
    }
}

// SOLVED //

/*
This Java 8 challenge tests your knowledge of Lambda expressions!

Write the following methods that return a lambda expression performing a specified action:
1. PerformOperation isOdd(): The lambda expression must return "true" if a number is odd or "false" if it is even.
2. PerformOperation isPrime(): The lambda expression must return "true" if a number is prime or "false" if it is composite.
3. PerformOperation isPalindrome(): The lambda expression must return "true" if a number is a palindrome or "false" if
it is not.

Input Format
Input is handled for you by the locked stub code in your editor.

Output Format
The locked stub code in your editor will print T lines of output.

Sample Input
The first line contains an integer, T (the number of test cases).

The T subsequent lines each describe a test case in the form of 2 space-separated integers:
The first integer specifies the condition to check for (1 for Odd/Even, 2 for Prime, or 3 for Palindrome). The second
integer denotes the number to be checked.
5
1 4
2 5
3 898
1 3
2 12

Sample Output
EVEN
PRIME
PALINDROME
ODD
COMPOSITE
*/