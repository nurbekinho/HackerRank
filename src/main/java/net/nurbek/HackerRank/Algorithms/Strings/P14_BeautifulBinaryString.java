package net.nurbek.HackerRank.Algorithms.Strings;

public class P14_BeautifulBinaryString
{
    public static void main(String[] args)
    {
        System.out.println(3 == beautifulBinaryString("0100101010"));
        System.out.println(2 == beautifulBinaryString("0101010"));
        System.out.println(0 == beautifulBinaryString("01100"));
    }

    static int beautifulBinaryString(String b)
    {
        return (b.length() - b.replaceAll("010", "").length()) / 3;

        /*int count = 0;

        StringBuilder sb = new StringBuilder(b);
        for(int i = 0; i < sb.length() - 2; i++)
        {
            if(sb.substring(i, i+3).equals("010"))
            {
                sb.deleteCharAt(i+2);
                sb.insert(i+2, '1');
                count++;
            }
        }

        return count;*/
    }
}

// SOLVED //

/*
Alice has a binary string. She thinks a binary string is beautiful if and only if it doesn't contain the substring "010".

In one step, Alice can change a "0" to a "1" or vice versa. Count and print the minimum number of steps needed to make
Alice see the string as beautiful.

For example, if Alice's string is b = 010 she can change any one element and have a beautiful string.

Input Format
The first line contains an integer "n", the length of binary string.
The second line contains a single binary string "b".

Constraints
* 1 <= n <= 100
* b[i] e {0,1}

Output Format
Print the minimum number of steps needed to make the string beautiful.

Sample Input 0
7
0101010

Sample Output 0
2
*/