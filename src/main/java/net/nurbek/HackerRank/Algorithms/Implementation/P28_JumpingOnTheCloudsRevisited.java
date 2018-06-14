package net.nurbek.HackerRank.Algorithms.Implementation;

public class P28_JumpingOnTheCloudsRevisited
{
    public static void main(String[] args)
    {
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0}, 2));
        System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 1, 0}, 2));
    }

    static int jumpingOnClouds(int[] c, int k)
    {
        int energy = 100;
        int index = 0;

        while(true)
        {
            index = (index + k) % c.length;

            energy -= ((c[index] > 0) ? 2 : 0) + 1;

            if(index == 0)
                break;
        }

        return energy;
    }
}

// SOLVED //

/*
Ari is playing a cloud hopping game. In this game, there are sequentially numbered clouds that can be thunderheads or
cumulus clouds. Her character must jump from cloud to cloud until it reaches the start again.

To play, Ari is given an array of clouds, "c" and an energy level e = 100. She starts from c[0] and uses 1 unit of energy
to make a jump of size "k" to cloud c[(i + k) % n]. If Ari lands on a thundercloud, c[i] = 1, her energy (E) decreases by
2 additional units. The game ends when Ari lands back on cloud 0.

Given the values of "n", "k", and the configuration of the clouds as an array "c", can you determine the final value of
"e" after the game ends?

For example, give c = [0, 0, 1, 0] and k = 2, the indices of her path are 0 -> 2 -> 0. Her energy level reduces by 1 for
each jump to 98. She landed on one thunderhead at an additional cost of 2 energy units. Her final energy level is 96.

Note: Recall that % refers to the modulo operation. In this case, it serves to make the route circular. If Ari is at
c[n - 1] and jumps 1, she will arrive at c[0].

Input Format
The first line contains two space-separated integers, "n" and "k", the number of clouds and the jump distance.
The second line contains "n" space-separated integers c[i] where 0 <= i < n. Each cloud is described as follows:
* If c[i] = 0, then cloud i is a cumulus cloud.
* If c[i] = 1, then cloud i is a thunderhead.

Output Format
Print the final value of E on a new line.

Sample Input
8 2
0 0 1 0 0 1 1 0

Sample Output
92
*/