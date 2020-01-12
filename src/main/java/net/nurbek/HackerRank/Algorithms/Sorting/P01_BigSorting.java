package net.nurbek.HackerRank.Algorithms.Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class P01_BigSorting
{
    public static void main(String[] args)
    {
        String [] numbers = {"31415926535897932384626433832", "314159265358979323846264338327", "31415926535897932384626433832795", "3141592653589793238462643383279", "1", "3", "10", "3", "5"};
        
        Arrays.sort(numbers, new Comparator<String>()
        {
		    public int compare(String a, String b)
		    {
				if (a.length() > b.length())
					return 1;
				else if (a.length() < b.length())
					return -1;
				else if (a.length() == b.length())
				{
					for (int i = 0; i < a.length(); i++)
					{
						if (a.charAt(i) > b.charAt(i))
						return 1;
						if (a.charAt(i) < b.charAt(i))
						return -1;
					}
				}
				
				return 0;
			}
		});

		System.out.println(Arrays.toString(numbers));
    }
}