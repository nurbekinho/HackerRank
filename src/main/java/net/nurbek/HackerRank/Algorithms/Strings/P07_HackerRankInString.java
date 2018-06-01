package net.nurbek.HackerRank.Algorithms.Strings;

public class P07_HackerRankInString
{
	public static void main(String[] args)
	{
		System.out.println(hackerrankInString("hereiamstackerrank").equals("YES"));
	}

	static String hackerrankInString(String s)
	{
		String h = "hackerrank";
		int index = 0;

		while(index < s.length())
		{
			int indexOf = h.indexOf(s.charAt(index));
			if(indexOf == 0) h = h.substring(1);
			if(h.length() <= 0) return "YES";

			index++;
		}

		return "NO";
	}
}

// SOLVED //

/*
We say that a string contains the word "hackerrank" if a subsequence of its characters spell the word "hackerrank". For
example, if string s = haacckkerrannkk it does contain "hackerrank", but s = haacckkerankk does not. In the second case,
the second "r" is missing. If we reorder the first string as "hccaakkerrannkk", it no longer contains the subsequence
due to ordering.

More formally, let p[0], p[1], ..., p[9] be the respective indices of h, a, c, k, e, r, r, a, n, k in string "s". If
p[0] < p[1] < ... < p[9] is true, then "s" contains "hackerrank".

For each query, print "YES" on a new line if the string contains "hackerrank", otherwise, print "NO".

Input Format
The first line contains an integer "q", the number of queries.
Each of the next "q" lines contains a single query string "s".

Constraints
* 2 <= q <= 10^2
* 10 <= |s| <= 10^4

Output Format
For each query, print "YES" on a new line if "s" contains "hackerrank", otherwise, print "NO".

Sample Input 0
2
hereiamstackerrank
hackerworld

Sample Output 0
YES
NO
*/