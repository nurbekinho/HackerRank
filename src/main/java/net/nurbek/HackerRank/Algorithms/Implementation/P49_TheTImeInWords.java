package net.nurbek.HackerRank.Algorithms.Implementation;

public class P49_TheTImeInWords
{
    public static void main(String[] args)
    {
        System.out.println(timeInWords(1, 45));
        System.out.println(timeInWords(4, 15));
    }

    static String timeInWords(int h, int m)
    {
        String hour = (m <= 30 ? numbers[h - 1 < 0 ? 12 : h] : numbers[h + 1 > 12 ? 1 : h + 1]);

        if(m == 0) return hour + numbers[0];
        else if(m % 15 == 0) return (m <= 30 ? numbers[m] + " past " : numbers[60 - m] + " to ") + hour;
        else return (m < 30 ?
                    numbers[m] + (m % 10 == 1 ? " minute " : " minutes ") + "past " :
                    numbers[60 - m] + ((60 - m) % 10 == 1 ? " minute " : " minutes ") + "to ") + hour;
    }

    private static String[] numbers = {" o' clock", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
        "ten", "eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen",
        "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine",
        "half"
    };
}

// SOLVED //

/*
Given the time in numerals we may convert it into words, as shown below:
5:00 -> five o' clock
5:01 -> one minute past five
5:10 -> ten minutes past five
5:15 -> quarter past five
5:30 -> half past five
5:40 -> twenty minutes to six
5:45 -> quarter to six
5:47 -> thirteen minutes to six
5:28 -> twenty two minutes past five

At minute = 0, use o' clock. For 1 <= minutes <= 30, use past, and for 30 < minutes use to. Note the space between the
apostrophe and clock in o' clock. Write a program which prints the time in words for the input given in the format described.

Input Format
The first line contains h, the hours portion The second line contains m, the minutes portion.

Output Format
Print the time in words as described.

Sample Input
5
47

Sample Output
thirteen minutes to six
*/