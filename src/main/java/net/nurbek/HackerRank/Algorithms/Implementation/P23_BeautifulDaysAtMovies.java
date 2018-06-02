package net.nurbek.HackerRank.Algorithms.Implementation;

public class P23_BeautifulDaysAtMovies
{
    public static void main(String[] args)
    {
        System.out.println(2 == beautifulDays(20, 23, 6));
        System.out.println(607 == beautifulDays(49860, 205494, 155635764));
        System.out.println(127 == beautifulDays(819945, 946749, 8946432));
        System.out.println(805 == beautifulDays(949488, 1753821, 5005440));
    }

    static int beautifulDays(int i, int j, int k)
    {
        int count = 0;

        for(int day = i; day <= j; day++)
        {
            if(Math.abs(day - Integer.parseInt(new StringBuilder().append(day).reverse().toString())) % k == 0)
                count++;
        }

        return count;
    }
}

// SOLVED //

/*
Lily likes to play games with integers. She has created a new game where she determines the difference between a number
and its reverse. For instance, given the number 12, its reverse is 21. Their difference is 9. The number 120 reversed is
21, and their difference is 99.

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie
on a beautiful day.

Given a range of numbered days, [i...j] and a number "k", determine the number of days in the range that are beautiful.
Beautiful numbers are defined as numbers where |i - j| is evenly divisible by "k". If a day's value is a beautiful number,
it is a beautiful day. Print the number of beautiful days in the range.

Input Format
A single line of three space-separated integers describing the respective values of "i", "j", and "k".

Constraints
* 1 <= i <= j <= 2 * 10^6
* 1 <= k <= 2 * 10^9

Output Format
Print the number of beautiful days in the inclusive range between "i" and "j".

Sample Input
20 23 6

Sample Output
2
*/