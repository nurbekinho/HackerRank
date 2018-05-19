package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P11_SockMerchant
{
	public static void main(String[] args)
	{
		int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int[] socks2 = {6, 5, 2, 3, 5, 2, 2, 1, 1, 5, 1, 3, 3, 3, 5};
		
		System.out.println(3 == sockMerchant(socks.length, socks));
		System.out.println(6 == sockMerchant(socks2.length, socks2));
	}
	
	static int sockMerchant(int n, int[] ar)
	{
		Map<Integer, Integer> sockMap = new HashMap();
		
		for(int a : ar)
		{
			sockMap.put(a, sockMap.containsKey(a) ? sockMap.get(a).intValue() + 1 : 1);
		}
		
		int pairs = 0;
		
		for(Entry<Integer, Integer> sock : sockMap.entrySet())
		{
			pairs += sock.getValue() / 2;
		}
		
		return pairs;
    }
}

// SOLVED //

/*
John works at a clothing store. He has a large pile of socks that he must pair them by color for sale.
You will be given an array of integers representing the color of each sock. Determine how many pairs of socks with 
matching colors there are.
John works at a clothing store and he's going through a pile of socks to find the number of matching pairs. More 
specifically, he has a pile of n loose socks where each sock i is labeled with an integer, c[i], denoting its color. 
He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks, i and 
j, are a single matching pair if they have the same color (c[i] = c[j]).

Given n and the color of each sock, how many pairs of socks can John sell?

Input Format
The first line contains an integer n, the number of socks. 
The second line contains n space-separated integers describing the colors c[i] of the socks in the pile.

Constraints
* 1 <= n <= 100
* 1 <= c[i] <= 100 where 0 <= i < n
 
Output Format
Print the total number of matching pairs of socks that John can sell.

Sample Input
9
10 20 20 10 10 30 50 10 20

Sample Output
3
*/