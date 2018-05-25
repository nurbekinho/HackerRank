package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;

public class P18_ClimbingTheLeaderboard
{
    public static void main(String[] args)
    {
        int[] scores = {100};
        //int[] alice = {120, 120, 120};
        int[] alice = {5, 10, 15, 20, 25, 50, 120};

        System.out.println(Arrays.toString(climbingLeaderboard(scores, alice)));
    }

    static int[] climbingLeaderboard(int[] scores, int[] alice)
    {
        int[] ranks = new int[alice.length];

        int rank = 1;
        int rankIndex = alice.length - 1;

        for(int i = 0; i < scores.length; i++)
        {
            if(rankIndex < 0)
                break;

            int max = scores[i];

            for(int j = rankIndex; j >= 0; j--)
            {
                if (alice[j] >= max)
                {
                    ranks[rankIndex] = rank;
                    rankIndex--;
                }
                else
                    break;
            }

            if(i < scores.length - 1 && max > scores[i+1])
                rank++;
        }

        if(rankIndex >= 0)
        {
            rank++;

            for (int j = rankIndex; j >= 0; j--)
            {
                ranks[rankIndex] = rank;
                rankIndex--;
            }
        }

        return ranks;
    }
}

// SOLVED //

/*
Alice is playing an arcade game and wants to climb to the top of the leader board. Can you help her track her ranking as
she plays? The game uses Dense Ranking, so its leader board works like this:

* The player with the highest score is ranked number 1 on the leader board.
* Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following
ranking number.

We want to determine Alice's rank as she progresses up the leader board. For example, the four players on the leader
board have high scores of 100, 90, 90, and 80. Those players will have ranks 1, 2, 2, and 3, respectively. If Alice's
scores are 70, 80 and 105, her rankings after each game are 4th, 3rd and 1st.

You are given an array, "scores", of monotonically decreasing leader board scores, and another array, "alice", of Alice's
scores for the game. You must print "m" integers. The "j'th" integer should indicate the current rank of alice after her
"j'th" game.

Input Format
The first line contains an integer "n", the number of players on the leader board.
The next line contains "n" space-separated integers scores[i], the leader board scores in decreasing order.
The next line contains an integer, "m", denoting the number games Alice plays.
The last line contains "m" space-separated integers alice[j], her game scores.

Constraints
* 1 <= n <= 2 * 10^5
* 1 <= m <= 2 * 10^2
* 0 <= scores[i] <= 10^9 for 0 <= i < n
* 0 <= alice[j] <= 10^9 for 0 <= j < m
* The existing leader board, "scores", is in descending order.
* Alice's scores "alice", are in ascending order.

Sub task
For 60% of the maximum score:

Output Format
Print "m" integers. The "j'th" integer should indicate the rank of alice after playing the "j'th" game.

Sample Input 0
7
100 100 50 40 40 20 10
4
5 25 50 120

Sample Output 0
6
4
2
1
*/