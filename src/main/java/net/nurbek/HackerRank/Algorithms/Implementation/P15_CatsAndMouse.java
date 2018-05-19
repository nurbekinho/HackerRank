package net.nurbek.HackerRank.Algorithms.Implementation;

public class P15_CatsAndMouse
{
    public static void main(String[] args)
    {
        System.out.println(catAndMouse(1, 2, 3).equals("Cat B"));
        System.out.println(catAndMouse(1, 3, 2).equals("Mouse C"));
    }

    static String catAndMouse(int x, int y, int z)
    {
        if(Math.abs(z-x) == Math.abs(z-y))
            return "Mouse C";
        else if(Math.abs(z-x) > Math.abs(z-y))
            return "Cat B";
        else
            return "Cat A";
    }
}

// SOLVED //

/*
Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to
determine which cat will reach the mouse first, assuming the mouse doesn't move and the cats travel at equal speed. If
the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight.
You are given q queries in the form of x, y, and z representing the respective positions for cats A and B, and for mouse
C. Complete the function catAndMouse to return the appropriate answer to each query, which will be printed on a new line.

* If cat A catches the mouse first, print Cat A.
* If cat B catches the mouse first, print Cat B.
* If both cats reach the mouse at the same time, print Mouse C as the two cats fight and mouse escapes.

Input Format
The first line contains a single integer, q, denoting the number of queries.
Each of the q subsequent lines contains three space-separated integers describing the respective values of a: (cat
A's location), 3; (cat B's location), and 2 (mouse C's location).

Constraints
* 1 <= q <= 100
* 1 <= x,y,z <=100

Output Format
For each query, return Cat A if cat A catches the mouse first, Cat B if cat A catches the mouse first, or Mouse C if the
mouse escapes.

Sample Input 0
2
1 2 3
1 3 2

Sample Output 0
Cat B
Mouse C
*/