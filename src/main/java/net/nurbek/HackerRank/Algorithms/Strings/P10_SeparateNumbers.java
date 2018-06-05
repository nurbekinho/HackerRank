package net.nurbek.HackerRank.Algorithms.Strings;

public class P10_SeparateNumbers
{
	public static void main(String[] args)
	{
		//String [] strs = {"1234", "91011", "99100", "101103", "010203", "13", "1", "99910001001"};

        String [] strs = {"1234",
                "57585960616263646566676869707172",
                "57585960616263646566676869707072",
                "57585960616263646566676869707172",
                "57585960616263646566676869706172",
                "89101112131415161718192021222324",
                "89101112131415161718192021212324",
                "42434445464748495051525354555657",
                "42434445464748495051525354455657",
                "858687888990919293949596979899",
                "858687888990919293949595979899"};
		
		for(String s : strs)
		{
			Boolean isBeauty = false;
			String first = null;
			
			for(int i = 1; i < s.length() / 2 + 1; i++)
			{
				first = s.substring(0, i);
				if(isBeautiful(first, s.substring(i)))
				{
					isBeauty = true;
					break;
				}
			}
			
			System.out.println(isBeauty ? "YES " + first : "NO");
		}
	}
	
	static private Boolean isBeautiful(String first, String s)
	{
		if(s.length() <= 0) return true;
        String next = Long.toString(Long.parseLong(first) + 1);
		String sNext;
		try
		{
			sNext = s.substring(0, next.length());
		}
		catch(Exception e)
		{
			return false;
		}
		
		if(next.equals(sNext))
		{
			return isBeautiful(next, s.substring(next.length()));
		}
		
		return false;
	}
}

// SOLVED //

/*
A numeric string, "s", is beautiful if it can be split into a sequence of two or more positive integers, a[1], ..., a[n],
satisfying the following conditions:

1. a[i] - a[i-1] = 1 for any 1 < i <= n (i.e., each element in the sequence is 1 more than the previous element).
2. No a[i] contains a leading zero. For example, we can split s = 10203 into the sequence {1, 02, 03}, but it is not
beautiful because 02 and 03 have leading zeroes.
3. The contents of the sequence cannot be rearranged. For example, we can split s = 312 into the sequence {3, 1, 2}, but
it is not beautiful because it breaks our first constraint (i.e., 1 - 3 != 1).

The diagram below depicts some beautiful strings:
"1234" = "1" + "2" + "3" + "4"
"91011" = "9" + "10" + "11"

You must perform "q" queries where each query consists of some integer string "s". For each query, print whether or not
the string is beautiful on a new line. If it's beautiful, print "YES x", where "x" is the first number of the increasing
sequence. If there are multiple such values of "x", choose the smallest. Otherwise, print "NO".

Input Format
The first line contains an integer "q", the number of strings to evaluate.
Each of the next q-lines contains an integer string "s" to query.

Output Format
For each query, print its answer on a new line (i.e., either YES x where "x" is the smallest first number of the
increasing sequence, or NO).

Sample Input 0
7
1234
91011
99100
101103
010203
13
1

Sample Output 0
YES 1
YES 9
YES 99
NO
NO
NO
NO
*/