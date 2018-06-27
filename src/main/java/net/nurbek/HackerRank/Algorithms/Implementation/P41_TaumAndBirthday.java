package net.nurbek.HackerRank.Algorithms.Implementation;

public class P41_TaumAndBirthday
{
    public static void main(String[] args)
    {
        System.out.println(taumBday(10, 10, 1, 1, 1) == 20);
        System.out.println(taumBday(5, 9,2, 3, 4) == 37);
    }

    private static long taumBday(int b, int w, int bc, int wc, int z)
    {
        return Math.min(Math.min((long) b * bc + (long) w * wc, (long) b * bc + (long) w * (bc + z)),
                (long) b * (wc + z) + (long) w * wc);
    }
}

// SOLVED //

/*
Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from
Taum: one is black and the other is white. To make her happy, Taum has to buy "b" black gifts and "w" white gifts.

The cost of each black gift is "bc" units.
The cost of every white gift is "wd" units.
The cost of converting each black gift into white gift or vice versa is "z" units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

Input Format
The first line will contain an integer "t", the number of test cases.
The next "t" pairs of lines are as follows: - The first line contains the values of integers "b" and "w". - The next
line contains the values of integers "bw", "wc", and "z".

Output Format
"t" lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.

Sample Input
5
10 10
1 1 1
5 9
2 3 4
3 6
9 1 1
7 7
4 2 1
3 3
1 9 2

Sample Output
20
37
12
35
12

Explanation

Test Case #01:
Since black gifts cost the same as white, there is no benefit to converting the gifts. Taum will have to buy each gift
for 1 unit. The cost of buying all gifts will be: b * bc + w * wc = 10 * 1 + 1 * 10 = 20.

Test Case #02:
Again, we can't decrease the cost of black or white gifts by converting colors. "z" is too high. We will buy gifts at
their original prices, so the cost of buying all gifts will be: b * bc + w * wc = 5 * 2 + 9 * 3 = 37.

Test Case #03:
Since bc < bw + z, we will buy b + w = 9 white gifts at their original price of 1. b = 3 of the gifts must be black, and
the cost per conversion, z = 1. Total cost is 9 * 1 + 3 * 1 = 12.

Test Case #04:
Similarly, we will buy w = 7 white gifts at their original price, wc = 2. For black gifts, we will first buy white ones
and color them to black, so that their cost will be reduced to wc + z = 3. So cost of buying all gifts will be:
7 * 3 + 7 * 2 = 35.

Test Case #05: We will buy black gifts at their original price, bc = 1. For white gifts, we will first black gifts worth
bc = 1 unit and color them to white for z = 2 units. The cost for white gifts is reduced to wc = bc + z = 4 units. The
cost of buying all gifts will be: 3 * 1 + 3 * 3 = 12.
*/
