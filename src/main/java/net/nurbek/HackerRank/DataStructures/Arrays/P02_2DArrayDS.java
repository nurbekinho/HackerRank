package net.nurbek.HackerRank.DataStructures.Arrays;

public class P02_2DArrayDS {
    public static void main(String[] args) {
        System.out.println(hourglassSum(new int[][]{
                {1, 1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}
        }));

        System.out.println(hourglassSum(new int[][]{
                {-1, -1, 0, -9, -2, -2},
                {-2, -1, -6, -8, -2, -5},
                {-1, -1, -1, -2, -3, -4},
                {-1, -9, -2, -4, -4, -5},
                {-7, -3, -3, -2, -9, -9},
                {-1, -3, -1, -2, -4, -5}
        }));
    }

    static int hourglassSum(int[][] arr) {
        int max = -64;

        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                int sum = arr[i][j];

                for(int k = j - 1; k < j + 2; k++) {
                    sum += arr[i - 1][k] + arr[i + 1][k];
                }

                max = Math.max(max, sum);
            }
        }

        return max;
    }
}

// SOLVED //
