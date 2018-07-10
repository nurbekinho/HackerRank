package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P54_FairRations
{
    public static void main(String[] args)
    {
        // Test #2
        String subjects = "3 8 4 6 1 9 8 8 6 7 5 2 1 5 8 6 1 3 3 9 3 7 8 5 5 4 7 2 9 8 7 7 4 4 7 1 5 3 10 7 10 10 9 1 9 10 1 10 2 7 2 10 2 7 8 10 3 8 1 3 4 1 6 1 5 3 10 7 6 10 6 6 1 6 3 9 6 8 4 9 5 3 7 7 3 5 4 2 7 5 6 4 3 10 4 5 2 4 7 5 6 10 3 4 8 4 10 7 8 9 1 10 2 6 4 10 1 2 6 3 6 4 9 6 6 2 8 8 5 9 7 4 2 10 10 6 4 7 2 8 4 5 6 1 1 7 3 5 2 7 10 1 6 2 2 9 3 1 10 1 2 5 5 5 4 9 9 7 9 2 6 4 2 10 9 2 8 8 10 9 1 7 3 3 7 4 9 3 3 3 1 6 5 2 7 9 4 1 4 1 10 7 8 6 4 6 5 6 1 1 7 6 1 8 5 3 3 4 5 7 10 3 10 9 8 10 9 2 3 9 6 3 3 10 5 3 3 1 10 8 6 5 8 5 8 7 5 5 9 6 1 9 5 2 8 8 1 8 7 1 7 3 4 3 7 7 5 4 7 10 7 3 3 9 2 4 2 7 1 6 6 3 2 1 5 4 6 7 8 8 9 10 5 1 1 10 3 7 3 5 2 6 4 7 4 6 8 10 10 4 3 10 7 1 5 1 6 1 5 8 6 10 2 4 9 10 2 1 8 9 1 6 4 4 9 5 9 3 2 3 4 8 9 5 6 10 3 1 3 4 7 4 8 9 9 8 10 4 3 6 7 1 9 6 8 4 7 6 8 9 2 4 6 8 1 8 7 9 5 7 9 10 4 2 5 3 2 2 8 2 10 10 9 1 10 10 7 6 9 2 1 4 3 4 5 9 8 6 9 4 3 10 6 8 10 2 4 2 9 5 7 4 7 6 10 3 5 8 2 5 3 8 8 2 10 4 3 6 9 3 5 10 10 8 6 4 6 1 10 9 3 4 7 3 7 10 7 4 2 5 3 9 2 6 6 4 4 2 4 3 2 10 1 6 7 5 2 8 2 9 4 3 4 9 3 4 9 6 8 5 5 8 3 6 8 7 6 9 9 3 1 8 9 5 10 5 4 9 9 3 6 8 10 1 9 6 7 5 3 10 1 2 9 4 4 4 6 3 6 9 2 5 9 8 6 8 6 7 5 6 3 10 1 2 2 5 6 9 5 6 5 10 5 2 7 1 2 10 7 7 7 1 1 7 6 4 5 7 4 10 6 4 5 9 3 5 10 7 1 10 1 9 6 3 5 6 5 5 6 2 9 4 8 8 10 1 3 6 2 2 2 2 9 3 7 6 6 1 1 2 10 5 9 2 7 4 8 1 4 9 6 8 7 6 7 9 8 4 2 1 3 10 7 2 7 8 4 1 10 6 9 7 4 7 8 10 3 4 6 10 7 10 7 2 6 1 9 6 9 4 6 2 4 9 6 5 8 4 10 4 5 5 10 4 5 8 7 2 8 2 1 6 9 3 8 3 4 5 5 3 7 10 5 7 9 2 6 7 9 3 5 8 4 4 2 6 6 1 9 2 9 5 7 4 4 7 4 2 8 1 6 6 9 2 2 4 7 5 3 2 8 5 6 10 1 1 3 5 5 1 5 4 4 3 10 5 1 10 1 7 2 8 9 3 6 6 2 7 3 6 6 4 7 9 10 2 3 3 10 9 7 5 7 5 5 10 5 4 10 2 5 6 6 7 7 3 2 9 2 9 1 1 2 6 8 1 2 9 10 8 2 7 10 9 2 1 5 4 8 2 4 9 1 1 7 4 10 3 1 9 3 7 7 8 8 5 1 4 1 1 10 1 7 9 5 1 8 7 9 10 1 7 2 10 5 4 1 7 8 5 8 9 9 6 1 8 7 3 9 10 6 5 9 2 7 3 5 1 1 5 6 10 9 5 10 4 4 5 9 6 4 3 2 2 2 6 6 5 1 5 2 1 3 6 1 5 8 9 9 5 3 10 6 8 2 4 3 8 4 10 3 10 5 1 10 1 9 8 7 1 6 6 4 2 1 3 6 8 7 7 10 5 8 7 7 4 8 8 1 4 5 3 10 1 7 1 7 6 10 4 7 8 5 3 2 3 5 9 9 9 10 9 9 9 8 1 2 6 9 9 7 8 1 5 9 8 6 9 2 6";
        int[] s = Arrays.stream(subjects.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.println(fairRations(s).equals("1042"));
    }

    static String fairRations(int[] B)
    {
        int odds = 0;
        int sum = Arrays.stream(B).sum();

        if(sum % 2 == 0)
        {
            for(int i = 0; i < B.length - 1; i++)
            {
                if(B[i] % 2 != 0)
                {
                    odds += 2;
                    B[i]++;
                    B[i + 1]++;
                }
            }

            return Integer.toString(odds);
        }

        return "NO";
    }
}

// SOLVED //

/*
You are the benevolent ruler of Rankhacker Castle, and today you're distributing bread. Your subjects are in a line, and
some of them already have some loaves.

Times are hard and your castle's food stocks are dwindling, so you must distribute as few loaves as possible according
to the following rules:
1. Every time you give a loaf of bread to some person , you must also give a loaf of bread to the person immediately in
front of or behind them in the line (i.e., persons i + 1 or i - 1).
2. After all the bread is distributed, each person must have an even number of loaves.

Given the number of loaves already held by each citizen, find and print the minimum number of loaves you must distribute
to satisfy the two rules above. If this is not possible, print NO.

For example, the people in line have loaves B = [4, 5, 6, 7]. We can first give a loaf to i = 3 and i = 4 so
B = [4, 5, 7, 8]. Next we give a loaf to i = 2 and i = 3 and have B = [4, 6, 8, 8] which satisfies our conditions. We
had to distribute 4 loaves.

Input Format
The first line contains an integer N, the number of subjects in the bread line.
The second line contains N space-separated integers B[i].

Output Format
Print a single integer denoting the minimum number of loaves you must distribute to adjacent people in the line so that
every person has an even number of loaves. If it's not possible to do this, print NO.

Sample Input 0
5
2 3 4 5 6

Sample Output 0
4

Explanation 0
The initial distribution is (2,3,4,5,6). You can satisfy the problem's requirements by performing the following actions:
1. Give 1 loaf of bread each to the second and third people so that the distribution becomes (2, 4, 5, 5, 6).
2. Give 1 loaf of bread each to the third and fourth people so that the distribution becomes (2, 4, 6, 6, 6).

Each of the N subjects has an even number of loaves after 4 loaves were distributed.

Sample Input 1
2
1 2

Sample Output 1
NO

Explanation 1
The initial distribution is (1, 2). As there are only 2 people in the line, any time you give one person a loaf you must
always give the other person a loaf. Because the first person has an odd number of loaves and the second person has an
even number of loaves, no amount of distributed loaves will ever result in both subjects having an even number of loaves.
*/