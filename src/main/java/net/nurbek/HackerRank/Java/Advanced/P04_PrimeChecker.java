package net.nurbek.HackerRank.Java.Advanced;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class P04_PrimeChecker {
    public static void main(String[] args) {
        try {
            Prime ob = new Prime();
            ob.checkPrime(2);
            ob.checkPrime(1);
            ob.checkPrime(1, 2);
            ob.checkPrime(1, 2, 3);
            ob.checkPrime(1, 2, 3, 4, 5);

            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet();
            boolean overload = false;

            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }

                set.add(methods[i].getName());

            }

            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Prime {
    public void checkPrime(int... numbers) {
        for (int number : numbers) {
            if (isPrime(number)) System.out.print(number + " ");
        }

        System.out.println();
    }

    private boolean isPrime(int number) {
        if (number == 2) return true;
        if (number == 1 || number % 2 == 0) return false;

        for (int i = 3; i < Math.sqrt(number) + 1; i += 2) {
            if (number % i == 0) return false;
        }

        return true;
    }
}

// SOLVED //

/*
You are given a class Solution and its main method in the editor. Your task is to create a class Prime. The class Prime
should contain a single method checkPrime.

The locked code in the editor will call the checkPrime method with one or more integer arguments. You should write the
checkPrime method in such a way that the code prints only the prime numbers.

Please read the code given in the editor carefully. Also please do not use method overloading!

Note: You may get a compile time error in this problem due to the statement below:
    BufferedReader br=new BufferedReader(new InputStreamReader(in));

This was added intentionally, and you have to figure out a way to get rid of the error.

Input Format
There are only five lines of input, each containing one integer.

Output Format
There will be only four lines of output. Each line contains only prime numbers depending upon the parameters passed to
checkPrime in the main method of the class Solution. In case there is no prime number, then a blank line should be printed.

Sample Input
2
1
3
4
5

Sample Output
2
2
2 3
2 3 5
*/