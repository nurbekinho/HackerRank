package net.nurbek.HackerRank.Algorithms.Implementation;

public class P59_StrangeCounter
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 100; i++) {
            System.out.println(i + " " + strangeCounter(i));
        }

        System.out.println(strangeCounter(1000000000));
    }

    private static long strangeCounter(long t)
    {
        long pow = 1;
        long v = 3;

        while(true)
        {
            long k = v * ((long) Math.pow(2, pow) - 1);

            if(k >= t)
                return 1 + k - t;

            pow++;
        }
    }
}

// SOLVED //

/*
Bob has a strange counter. At the first second, it displays the number 3. Each second, the number displayed by the
counter decrements by 1 until it reaches 1.

The counter counts down in cycles. In next second, the timer resets to "2 x the initial number for the prior cycle" and
continues counting down. The diagram below shows the counter values for each time "t" in the first three cycles:
time | value     time | value     time | value
1    | 3         4    | 6         10   | 12
2    | 2         5    | 5         11   | 11
3    | 1         6    | 4         12   | 10
                 7    | 3         13   | 9
                 8    | 2         14   | 8
                 9    | 1         15   | 7
                                  ...  | ...
                                  21   | 1

Find and print the value displayed by the counter at time t.

Input Format
A single integer denoting the value of t.

Output Format
Print the value displayed by the strange counter at the given time t.

Sample Input
4

Sample Output
6

Explanation
Time t = 4 marks the beginning of the second cycle. It is double the number displayed at the beginning of the first
cycle: 2 x 3 = 6. This is also shown in the diagram in the Problem Statement above.
*/