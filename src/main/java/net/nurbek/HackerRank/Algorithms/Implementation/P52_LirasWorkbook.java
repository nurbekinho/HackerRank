package net.nurbek.HackerRank.Algorithms.Implementation;

public class P52_LirasWorkbook
{
    public static void main(String[] args)
    {
        System.out.println(workbook(5, 3, new int[]{4, 2, 6, 1, 10}) == 4);
    }

    private static int workbook(int n, int k, int[] arr)
    {
        int count = 0;
        int page = 1;

        for(int i = 1; i <= n; i++)
        {
            int pages = (arr[i-1] % k == 0) ? arr[i-1] / k : (arr[i-1] / k) + 1;

            for(int j = 1; j <= pages; j++)
            {
                if(page >= (j - 1) * k + 1 && page <= Math.min(j * k, arr[i-1]))
                    count++;

                page++;
            }
        }

        return count;
    }
}

// SOLVED //

/*
Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters. Lisa believes a problem
to be special if its index (within a chapter) is the same as the page number where it's located. The format of Lisa's
book is as follows:
* There are n chapters in Lisa's workbook, numbered from 1 to n.
* The i-th chapter has arr[i] problems, numbered from 1 to arr[i].
* Each page can hold up to k problems. Only a chapter's last page of exercises may contain fewer than k problems.
* Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
* The page number indexing starts at 1.

Given the details for Lisa's workbook, can you count its number of special problems?

For example, Lisa's workbook contains arr[1] = 4 problems for chapter 1, and arr[2] problems for chapter 2. Each page
can hold k = 3 problems. The first page will hold 3 problems for chapter 1. Problem 1 is on page 1, so it is special.
Page 2 contains only Chapter 1, Problem 4, so no special problem is on page 2. Chapter 2 problems start on page 3 and
there are 2 problems. Since there is no problem 3 on page 3, there is no special problem on that page either. There is 1
special problem in her workbook.

Note: See the diagram in the Explanation section for more details.

Input Format
The first line contains two integers n and k, the number of chapters and the maximum number of problems per page.
The second line contains n space-separated integers arr[i] where arr[i] denotes the number of problems in the i-th
chapter.

Output Format
Print the number of special problems in Lisa's workbook.

Sample Input
5 3
4 2 6 1 10

Sample Output
4

Explanation
The diagram below depicts Lisa's workbook with n = 5 chapters and a maximum of k = 3 problems per page. Special problems
are outlined in red, and page numbers are in yellow squares.

Page | Chapter | Problems | Special
   1 |       1 |  1, 2, 3 |    +
   2 |       1 |        4 |    -
   3 |       2 |     1, 2 |    -
   4 |       3 |  1, 2, 3 |    -
   5 |       3 |  4, 5, 6 |    +
   6 |       4 |        1 |    -
   7 |       5 |  1, 2, 3 |    -
   8 |       5 |  4, 5, 6 |    -
   9 |       5 |  7, 8, 9 |    +
  10 |       5 |       10 |    +

There are 4 special problems and thus we print the number 4 on a new line.
*/