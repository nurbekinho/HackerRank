package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P05_BreakingTheRecords
{
    public static void main(String[] args)
    {
        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        System.out.println(Arrays.toString(breakingRecords(scores)));
    }

    static int[] breakingRecords(int[] scores)
    {
        int[] records = new int[2];

        int best = scores[0];
        int worst = scores[0];

        int high = 0;
        int low = 0;

        for(int i = 0; i < scores.length; i++)
        {
            if(scores[i] > best)
            {
                best = scores[i];
                high++;
            }

            if(scores[i] < worst)
            {
                worst = scores[i];
                low++;
            }
        }

        records[0] = high;
        records[1] = low;

        return records;
    }
}

// SOLVED //

/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the
number of times she breaks her season record for most points and least points in a game. Points scored in the first game
establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array score = [12, 24, 10, 24]. Scores are in the
same order as the games played. She would tabulate her results as follows:
                                 Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1

 Given Maria's array of 'scores' for a season of 'n' games, find and print the number of times she breaks her records
 for most and least points scored during the season.

 Input Format
The first line contains an integer 'n', the number of games.
The second line contains 'n' space-separated integers describing the respective values of score[0], ..., score[n-1].

Constraints
* 1 <= n <= 1000
* 0 <= score[i] <= 10^8

Output Format
Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her
worst (lowest) score decreased.

Sample Input 0
9
10 5 20 20 4 5 2 25 1

Sample Output 0
2 4
*/