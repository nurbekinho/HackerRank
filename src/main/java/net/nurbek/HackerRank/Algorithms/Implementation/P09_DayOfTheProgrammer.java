package net.nurbek.HackerRank.Algorithms.Implementation;

public class P09_DayOfTheProgrammer
{
    public static void main(String[] args)
    {
        System.out.println(solve(2016).equals("12.09.2016"));
        System.out.println(solve(2017).equals("13.09.2017"));
    }

    static String solve(int year)
    {
        int feb;

        if(year == 1918)
            feb = 15;
        else if(year < 1918)
            feb = year % 4 == 0 ? 29 : 28;
        else
            feb = year % 400 == 0 || year % 100 != 0 && year % 4 == 0 ? 29 : 28;

        int months = 31 + feb + 31 + 30 + 31 + 30 + 31 + 31;

        return 256 - months + ".09." + year;
    }
}

// NOT SOLVED //

/*
Marie invented a Time Machine and wants to test it by time-traveling to visit Russia on the Day of the Programmer (the
256th day of the year) during a year in the inclusive range from 1700 to 2700.

From 1700 to 1917, Russia's official calendar was the Julian calendar; since 1919 they used the Gregorian calendar
system. The transition from the Julian to Gregorian calendar system occurred in 1918, when the next day after January
31st was February 14th. This means that in 1918, February 14th was the 32nd day of the year in Russia.

In both calendar systems, February is the only month with a variable amount of days; it has 29 days during a leap year,
and 28 days during all other years. In the Julian calendar, leap years are divisible by 4; in the Gregorian calendar,
leap years are either of the following:
* Divisible by 400
* Divisible by 4 and not divisible by 100

Given a year, y, find the date of the 256th day of that year according to the official Russian calendar during that year.
Then print it in the format dd.mm.yyyy, where dd is the two-digit day, mm is the two-digit month, and yyyy is y.

Input Format
A single integer denoting year y.

Constraints
1700 <= y <= 2700

Output Format
Print the full date of Day of the Programmer during year y in the format dd.mm.yyyy, where dd is the two-digit day, mm
is the two-digit month, and yyyy is y.
*/