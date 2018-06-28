package net.nurbek.HackerRank.Algorithms.Implementation;

public class P46_BeautifulTriplets
{
    public static void main(String[] args)
    {
        System.out.println(beautifulTriplets(3, new int[]{1, 2, 4, 5, 7, 8, 10}));
    }

    static int beautifulTriplets(int d, int[] arr)
    {
        int count = 0;

        for(int i = 0; i < arr.length - 2; i++)
        {
            for(int j = i + 1; j < arr.length - 1; j++)
            {
                if(arr[j] - arr[i] == d)
                {
                    for(int k = j + 1; k < arr.length; k++)
                    {
                        if(arr[k] - arr[j] == d)
                        {
                            count++;
                            break;
                        }
                        else if(arr[k] - arr[j] > d)
                            break;
                    }
                }
                else if(arr[j] - arr[i] > d)
                    break;
            }
        }

        return count;
    }
}

// SOLVED //

/*
Erica wrote an increasing sequence of "n" numbers (a[0], a[1], ..., a[n]) in her notebook. She considers a triplet
(a[i], a[j], a[k]) to be beautiful if:
* i < j < k
* a[j] - a[i] = a[k] - a[j] = d

Given the sequence and the value of "d", can you help Erica count the number of beautiful triplets in the sequence?

Input Format
The first line contains 2 space-separated integers n and d, the length of the sequence and the beautiful difference.
The second line contains n space-separated integers a[i].

Output Format
Print a single line denoting the number of beautiful triplets in the sequence.

Sample Input
7 3
1 2 4 5 7 8 10

Sample Output
3
*/
