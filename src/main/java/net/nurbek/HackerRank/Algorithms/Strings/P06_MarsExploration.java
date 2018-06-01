package net.nurbek.HackerRank.Algorithms.Strings;

public class P06_MarsExploration
{
    public static void main(String[] args)
    {
        System.out.println(marsExploration("sosSOSsos"));
    }

    static int marsExploration(String s)
    {
        int count = 0;
        String sos = "SOS";

        for(int i = 0; i < s.length(); i++)
        {
            if (Character.compare(sos.charAt(i%3), s.charAt(i)) != 0)
                count++;
        }

        return count;
    }
}

// SOLVED //

/*
Sami's spaceship crashed on Mars! She sends a series of "SOS" messages to Earth for help.

Letters in some of the "SOS" messages are altered by cosmic radiation during transmission. Given the signal received by
Earth as a string, "s", determine how many letters of Sami's "SOS" have been changed by radiation.

Input Format
There is one line of input: a single string, "s".

Note: As the original message is just "SOS" repeated "n" times, "s"'s length will be a multiple of 3.

Constraints
* 1 <= |s| <= 99
* |s| % 3 = 0
* "s" will contain only uppercase English letters, ascii[A-Z].

Output Format
Print the number of letters in Sami's message that were altered by cosmic radiation.

Sample Input 0
SOSSPSSQSSOR

Sample Output 0
3
*/
