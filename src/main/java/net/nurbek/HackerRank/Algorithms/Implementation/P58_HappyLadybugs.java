package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;

public class P58_HappyLadybugs
{
    public static void main(String[] args)
    {
        /*System.out.println(happyLadybugs("RBY_YBR"));
        System.out.println(happyLadybugs("X_Y__X"));
        System.out.println(happyLadybugs("__"));
        System.out.println(happyLadybugs("B_RRBR"));*/

        // Test #1
        System.out.println(happyLadybugs("_").equals("YES"));
        System.out.println(happyLadybugs("RBRB").equals("NO"));
        System.out.println(happyLadybugs("RRRR").equals("YES"));
        System.out.println(happyLadybugs("BBB").equals("YES"));
        System.out.println(happyLadybugs("BBB_").equals("YES"));

        // Test #2
        System.out.println(happyLadybugs("G").equals("NO"));
        System.out.println(happyLadybugs("GR").equals("NO"));
        System.out.println(happyLadybugs("_GR_").equals("NO"));
        System.out.println(happyLadybugs("_R_G_").equals("NO"));
        System.out.println(happyLadybugs("R_R_R").equals("YES"));
        System.out.println(happyLadybugs("RRGGBBXX").equals("YES"));
        System.out.println(happyLadybugs("RRGGBBXY").equals("NO"));

        // Test #3
        //Scanner scan = new Scanner(System.in);
        //int tests = scan.nextInt();
        String[] results = {"NO", "YES", "YES", "NO", "YES", "YES", "YES", "NO", "NO", "NO", "NO", "NO", "YES", "NO",
                "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "NO", "YES", "NO", "NO",
                "NO", "NO", "YES", "YES", "NO", "YES", "YES"};

        /*for(int i = 0; i < tests; i++)
        {
            scan.nextInt();
            String test = scan.next();
            System.out.println(i + " " + test + " " + happyLadybugs(test).equals(results[i]));
        }*/
        System.out.println(happyLadybugs("IIIAA").equals("YES"));
    }

    static String happyLadybugs(String b)
    {
        Map<Character, Integer> stats = new HashMap();
        int spaces = 0;
        boolean unhappyExist = false;

        for(int i = 0; i < b.length(); i++)
        {
            Character c = b.charAt(i);
            if(i > 0 && i < b.length() - 1 && !unhappyExist)
            {
                if(c != b.charAt(i - 1) && c != b.charAt(i + 1)) unhappyExist = true;
            }

            if(c == '_')
            {
                spaces++;
                continue;
            }

            if(stats.containsKey(c))
                stats.put(c, stats.get(c) + 1);
            else
                stats.put(c, 1);
        }

        if(stats.containsValue(1) || unhappyExist && spaces == 0) return "NO";

        return "YES";
    }
}

// SOLVED //

/*
Happy Ladybugs is a board game having the following properties:

• The board is represented by a string, "b", of length "n". The i-th character of the string, b[i], denotes the i-th
cell of the board.
    * If b[i] is an underscore (i.e., _), it means the i-th cell of the board is empty.
    * If b[i] is an uppercase English alphabetic letter (ascii[A-Z]), it means the i-th cell contains a ladybug of color
      b[i].
    * String "b" will not contain any other characters.
• A ladybug is happy only when its left or right adjacent cell (i.e., b[i ± 1]) is occupied by another ladybug having
the same color.
• In a single move, you can move a ladybug from its current position to any empty cell.

Given the values of n and b for g games of Happy Ladybugs, determine if it's possible to make all the ladybugs happy.
For each game, print YES on a new line if all the ladybugs can be made happy through some number of moves. Otherwise,
print NO.

As an example, b = [YYR_B_BR]. You can move the rightmost B and R to make b = [YYRRBB__] and all the ladybugs are happy.

Input Format
The first line contains an integer g, the number of games.
The next g pairs of lines are in the following format:
• The first line contains an integer n, the number of cells on the board.
• The second line contains a string b describing the n cells of the board.

Sample Input 0
4
7
RBY_YBR
6
X_Y__X
2
__
6
B_RRBR

Sample Output 0
YES
NO
YES
YES

Explanation 0

The four games of Happy Ladybugs are explained below:
1. Initial board:
RBY_YBR
After the first move:
RBYY_BR
After the second move:
R_YYBBR
After the third move:
RRYYBB_
Now all the ladybugs are happy, so we print YES on a new line.

2. There is no way to make the ladybug having color Y happy, so we print NO on a new line.

3. There are no unhappy ladybugs, so we print YES on a new line.

4. Move the rightmost B and R to form b = [BBRRR_].
*/