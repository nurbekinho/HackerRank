package net.nurbek.HackerRank.Algorithms.Strings;

public class P11_FunnyStrings
{
	public static void main(String[] args)
	{
		String str = "acxz";
		System.out.println(funnyString(str));
	}
	
	static String funnyString(String s)
	{
		for(int i = 0; i < s.length() - 1; i++)
		{
			int c1 = Character.getNumericValue(s.charAt(i));
			int c2 = Character.getNumericValue(s.charAt(i + 1));
			int d1 = Character.getNumericValue(s.charAt(s.length() - i - 1));
			int d2 = Character.getNumericValue(s.charAt(s.length() - i - 2));
			if(Math.abs(c1-c2) != Math.abs(d1-d2)) return "Not Funny";
		}
		
		return "Funny";
    }
}

// SOLVED //

/*
In this challenge, you will determine whether a string is funny or not. To determine whether a string is funny, create a
copy of the string in reverse e.g. "abc" -> "cba". Iterating through each string, compare the absolute difference in the
ascii values of the characters at positions 0 and 1, 1 and 2 and so on to the end. If the list of absolute differences is
the same for both strings, they are funny.

Note: The absolute value of "x", is written as |x|.

Input Format
The first line contains an integer "t", (the number of test cases).
The next "t" lines contain a string, "s".

Output Format
For each string "s" print whether it is "Funny" or "Not Funny" on a new line.

Sample Input
2
acxz
bcxz

Sample Output
Funny
Not Funny
*/