package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P17_PickingNumbers
{
	public static void main(String[] args)
	{
        int[] numbers = {4, 6, 5, 3, 3, 1};
        //int[] numbers = {1, 2, 2, 3, 1, 2};
        Arrays.sort(numbers);
        
        int max = 0;
        
        for(int i = 0; i < numbers.length - 1; i++)
        {
        	int count = 1;
        	
        	if(i > 0 && numbers[i] == numbers[i-1]) continue;
        	
        	for(int j = i + 1; j < numbers.length; j++)
        	{
        		if(Math.abs(numbers[i] - numbers[j]) <= 1) count++;
        		else
        			break;
        	}
        	
        	if(count > max) max = count;
        }
        
        System.out.println(max);
	}
}

// SOLVED //

/*
Given an array of integers, find and print the maximum number of integers you can select from the array such that the
absolute difference between any two of the chosen integers is less than or equal to 1. For example, if your array is
a = [1, 1, 2, 2, 4, 4, 5, 5, 5], you can create two subarrays meeting the criterion: [1, 1, 2, 2] and [4, 4, 5, 5, 5].
The maximum length subarray has 5 elements.

Input Format
The first line contains a single integer n, the size of the array (1.
The second line contains n space-separated integers a[i].

Constraints
* 2 <= n <= 100
* 0 < a[i] < 100
* The answer will be >= 2.

Output Format
A single integer denoting the maximum number of integers you can choose from the array such that the absolute difference
between any two of the chosen integers is <= 1.

Sample Input 0
6
4 6 5 3 3 1

Sample Output 0
3

Explanation 0
We choose the following multiset of integers from the array: {4, 3, 3}. Each pair in the multiset has an absolute
difference <= 1 (i.e., |4 - 3| = 1 and |3 - 3| = 0), so we print the number of chosen integers, 3, as our answer.
*/