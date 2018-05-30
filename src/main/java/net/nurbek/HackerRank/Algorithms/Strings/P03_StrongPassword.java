package net.nurbek.HackerRank.Algorithms.Strings;

public class P03_StrongPassword
{
    public static void main(String[] args)
    {
        System.out.println(minimumNumber(11, "#HackerRank"));
        System.out.println(minimumNumber(4, "4700"));
        System.out.println(minimumNumber(3, "Ab1"));
        System.out.println(minimumNumber(4, "goxg"));
        System.out.println(minimumNumber(4, "IGEC"));
        System.out.println(minimumNumber(5, "55542"));

    }

    static int minimumNumber(int n, String password)
    {
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        int count = 0;

        for(Character c : password.toCharArray())
        {
            if(numbers.indexOf(c) >= 0)
            {
                count++;
                numbers = "";
            }
            else if(lower_case.indexOf(c) >= 0)
            {
                count++;
                lower_case = "";
            }
            else if(upper_case.indexOf(c) >= 0)
            {
                count++;
                upper_case = "";
            }
            else if(special_characters.indexOf(c) >= 0)
            {
                count++;
                special_characters = "";
            }
        }

        return (n > 6 || n + 4 - count > 6) ? 4 - count : 6 - n;
    }
}

// SOLVED //

/*
Louise joined a social networking site to stay in touch with her friends. The signup page required her to input a name
and a password. However, the password must be strong. The website considers a password to be strong if it satisfies the
following criteria:
* Its length is at least 6.
* It contains at least one digit.
* It contains at least one lowercase English character.
* It contains at least one uppercase English character.
* It contains at least one special character. The special characters are: !@#$%^&*()-+

She typed a random string of length "n" in the password field but wasn't sure if it was strong. Given the string she
typed, can you find the minimum number of characters she must add to make her password strong?

Note: Here's the set of types of characters in a form you can paste in your solution:

numbers = "0123456789"
lower_case = "abcdefghijklmnopqrstuvwxyz"
upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
special_characters = "!@#$%^&*()-+"

Input Format
The first line contains an integer "n" denoting the length of the string.
The second line contains a string consisting of "n" characters, the password typed by Louise. Each character is either a
lowercase/uppercase English alphabet, a digit, or a special character.

Constraints
* 1 <= n <= 100

Output Format
Print a single line containing a single integer denoting the answer to the problem.

Sample Input 0
3
Ab1

Sample Output 0
3

Sample Input 1
11
#HackerRank

Sample Output 1
1
*/