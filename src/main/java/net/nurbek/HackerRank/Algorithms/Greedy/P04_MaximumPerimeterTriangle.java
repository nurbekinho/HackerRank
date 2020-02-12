package net.nurbek.HackerRank.Algorithms.Greedy;

import java.util.Arrays;

public class P04_MaximumPerimeterTriangle
{
    public static void main(String[] args)
    {
        long a = 1000000000;
        System.out.println(3 * a);
        //System.out.println(Arrays.toString(maximumPerimeterTriangle(new int[]{1, 1, 1, 2, 3, 5})));
        //System.out.println(Arrays.toString(maximumPerimeterTriangle(new int[]{1, 1, 1, 3, 3})));
        //System.out.println(Arrays.toString(maximumPerimeterTriangle(new int[]{1, 2, 3})));

        // Testcase #2
        //System.out.println(Arrays.toString(maximumPerimeterTriangle(new int[]{3, 9, 2, 15, 3})));

        // Testcase #11
        String s11 = "1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000 1000000000";
        String[] sArr = s11.split(" ");
        int[] i11 = new int[sArr.length];
        for(int i = 0; i < i11.length; i++) i11[i] = Integer.parseInt(sArr[i]);

        System.out.println(Arrays.toString(maximumPerimeterTriangle(i11)));
    }

    private static int[] maximumPerimeterTriangle(int[] sticks)
    {
        Arrays.sort(sticks);

        int result[] = new int[3];

        long perimeter = 0;

        for(int a = sticks.length - 1; a >= 2; a--)
        {
            for(int b = a - 1; b >= 1; b--)
            {
                for(int c = b - 1; c >= 0; c--)
                {
                    if(sticks[a] < sticks[b] + sticks[c])
                    {
                        long currentPerimeter = (long) sticks[a] + sticks[b] + sticks[c];

                        if(currentPerimeter > perimeter)
                        {
                            result[0] = sticks[c];
                            result[1] = sticks[b];
                            result[2] = sticks[a];

                            perimeter = currentPerimeter;
                        }
                    }
                }
            }
        }

        return perimeter == 0 ? new int[]{-1} : result;
    }
}

// SOLVED //