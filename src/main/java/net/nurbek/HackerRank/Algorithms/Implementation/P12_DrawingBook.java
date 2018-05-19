package net.nurbek.HackerRank.Algorithms.Implementation;

public class P12_DrawingBook
{
	public static void main(String[] args)
	{
        System.out.println(pageCount(10, 9));
        System.out.println(pageCount(6, 2));
        System.out.println(pageCount(5, 4));
    }

    static int pageCount(int n, int p)
    {
        int turn = 0;

        if(p > 1 && p < n) turn = Math.min((n - p) / 2, (p % 2 == 0) ? (p - 1) / 2 + 1 : (p - 1) / 2);
        if(n % 2 == 0 && n - p == 1) turn = 1;

        return turn;
    }
}

// SOLVED //

/*
Brie’s Drawing teacher asks her class to open their books to a page number. Brie can either start turning pages from the
front of the book or from the back of the book. She always turns pages one at a time. When she opens the book, page 1 is
always on the right side:
---------
|   |   |
|   | 1 |
|   |   |
---------

When she flips page 1, she sees pages 2 and 3. Each page except the last page will always be printed on both sides. The
last page may only be printed on the front, given the length of the book. If the book is n pages long, and she wants to
turn to page p, what is the minimum number of pages she will turn? She can start at the beginning or the end of a book.

Given n and p, find and print the minimum number of pages Brie must turn in order to arrive at page p.

Input Format
The first line contains an integer n, the number of pages in the book.
The second line contains an integer p, the page that Brie's teacher wants her to turn to.

Constraints
* 1 <= n <= 10^5
* 1 <= p <= n

Output Format
Print an integer denoting the minimum number of pages Brie must turn to get to page p.

Sample Input 0
6
2

Sample Output 0
1

Sample Input 1
5
4

Sample Output 1
0
 */