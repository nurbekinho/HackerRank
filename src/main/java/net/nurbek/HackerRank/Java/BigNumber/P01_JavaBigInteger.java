package net.nurbek.HackerRank.Java.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class P01_JavaBigInteger {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = scan.next();

		BigInteger biA = new BigInteger(a);
		BigInteger biB = new BigInteger(b);

		System.out.println(biA.add(biB));
		System.out.println(biA.multiply(biB));
	}
}

// SOLVED //

/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any
ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format
There will be two lines containing two numbers, a and b.

Constraints
a and b are non-negative integers and can have maximum 200 digits.

Output Format
Output two lines. The first line should contain "a + b", and the second line should contain "a * b". Don't print any
leading zeros.

Sample Input
1234
20

Sample Output
1254
24680
*/