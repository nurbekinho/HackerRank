package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P08_MigratoryBirds
{
    public static void main(String[] args)
    {
        int ar[] = {1, 4, 4, 4, 5, 3};

        System.out.println(4 == migratoryBirdsWithSorting(6, ar));
        System.out.println(4 == migratoryBirds(6, ar));
    }

    static int migratoryBirds(int n, int[] ar)
    {
        Map<Integer, Integer> birdTypes = new HashMap();

        for (int a : ar)
        {
            birdTypes.put(a, birdTypes.containsKey(a) ? birdTypes.get(a).intValue() + 1 : 1);
        }

        int maxType = 1;

        for (int i = 2; i <= 5; i++)
        {
            if(birdTypes.containsKey(i) && birdTypes.get(i) > birdTypes.get(maxType))
                maxType = i;
        }

        return maxType;
    }

    static int migratoryBirdsWithSorting(int n, int[] ar)
    {
        Arrays.sort(ar);

        int maxType = ar[0];
        int count = 1;
        int max = 1;

        for(int i = 1; i < ar.length; i++)
        {
            if(ar[i] == ar[i - 1]) count++;
            else count = 1;

            if(count > max)
            {
                max = count;
                maxType = ar[i];
            }
        }

        return maxType;
    }
}

// SOLVED //

/*
You have been asked to help study the population of birds migrating across the continent. Each type of bird you are
interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number
will be added to your array of sightings. You would like to be able to find out which type of bird is most common
given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are
equally common, choose the type with the smallest ID number.

Input Format
The first line contains an integer denoting n, the number of birds sighted and reported in the array ar.
The second line describes ar as n space-separated integers representing the type numbers of each bird sighted.

Constraints
* 5 <= n <= 2 * 10^5
* It is guaranteed that each type is 1, 2, 3, 4, or 5.

Output Format
Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with
the smallest ID number.

Sample Input 0
6
1 4 4 4 5 3

Sample Output 0
4

Explanation 0
The different types of birds occur in the following frequencies:
Type 1: 1 bird
Type 2: 0 birds
Type 3: 1 bird
Type 4: 3 birds
Type 5: 1 bird
The type number that occurs at the highest frequency is type 4, so we print 4 as our answer.
*/