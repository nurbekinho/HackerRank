package net.nurbek.HackerRank.Algorithms.Implementation;

public class P20_DesignerPdfViewer
{
    public static void main(String[] args)
    {
        int[] h1 = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word1 = "abc";

        int[] h2 = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word2 = "zaba";

        System.out.println(9 == designerPdfViewer(h1, word1));
        System.out.println(28 == designerPdfViewer(h2, word2));
    }

    static int designerPdfViewer(int[] h, String word)
    {
        int maxHeight = 0;

        for(Character c : word.toCharArray())
        {
            maxHeight = Math.max(maxHeight, h[c - 97]);
        }

        return maxHeight * word.length();
    }
}

// SOLVED //

/*
When you select a contiguous block of text in a PDF viewer, the selection is highlighted with a blue rectangle. In this
PDF viewer, each word is highlighted independently.
In this challenge, you will be given a list of letter heights in the alphabet and a string. Using the letter heights
given, determine the area of the rectangle highlight in mm^2 assuming all letters are 1mm wide.

Input Format
The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase
English letter, ascii[a-z].
The second line contains a single word, consisting of lowercase English alphabetic letters.

Constraints
* 1 <= h[?] <= 7, where ? is an English lowercase letter.
* Word contains no more than 10 letters.

Output Format
Print a single integer denoting the area in mm^2 of highlighted rectangle when the given word is selected. Do not print
units of measure.

Sample Input 0
1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc

Sample Output 0
9
*/