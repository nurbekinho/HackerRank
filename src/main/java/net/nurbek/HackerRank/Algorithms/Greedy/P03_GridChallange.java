package net.nurbek.HackerRank.Algorithms.Greedy;

import java.util.Arrays;

public class P03_GridChallange
{
    public static void main(String[] args)
    {
        System.out.println(gridChallenge(new String[]{"ebacd",
                                                    "fghij",
                                                    "olmkn",
                                                    "trpqs",
                                                    "xywuv"}));

        System.out.println(gridChallenge(new String[]{"ebacd",
                                                    "bbbbb",
                                                    "olmkn",
                                                    "trpqs",
                                                    "xywuv"}));
    }

    private static String gridChallenge(String[] grid)
    {
        for(int i = 0; i < grid.length; i++)
        {
            char[] chars = grid[i].toCharArray();
            Arrays.sort(chars);

            grid[i] = new String(chars);
        }

        for(int i = 0; i < grid.length - 1; i++)
        {
            for(int j = 0; j < grid[i].length(); j++)
            {
                if(grid[i].charAt(j) > grid[i + 1].charAt(j)) return "NO";
            }
        }

        return "YES";
    }
}

// SOLVED //