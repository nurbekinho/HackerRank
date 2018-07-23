package net.nurbek.HackerRank.Algorithms.Implementation;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P62_TheBombermanGame
{
    public static void main(String[] args)
    {
        int n1 = 3;
        String[] grid1 = {  ".......",
                            "...O...",
                            "....O..",
                            ".......",
                            "OO.....",
                            "OO....."};
        System.out.println(Arrays.toString(bomberMan(n1, grid1)));

        int n3 = 197;
        String[] grid3 = {  "...O.",
                            ".O.O.",
                            ".O...",
                            "..OO.",
                            "....."};
        System.out.println(Arrays.toString(bomberMan(n3, grid3)));
    }

    private static String[] bomberMan(int n, String[] grid)
    {
        if(n == 1) return grid;
        else if(n % 2 == 0)
        {
            for(int i = 0; i < grid.length; i++)
            {
                grid[i] = grid[i].replaceAll(".", "O");
            }

            return grid;
        }
        else if(n % 4 == 3)
        {
            return getExploded(grid);
        }

        return getExploded(getExploded(grid));
    }

    private static String[] getExploded(String[] grid)
    {
        Set<Point> bombCoords = new HashSet();

        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid[i].length(); j++)
            {
                if(grid[i].charAt(j) != '.')
                {
                    bombCoords.add(new Point(i, j));
                    if(i - 1 >= 0) bombCoords.add(new Point(i - 1, j));
                    if(i + 1 < grid.length) bombCoords.add(new Point(i + 1, j));
                    if(j - 1 >= 0) bombCoords.add(new Point(i, j - 1));
                    if(j + 1 < grid[i].length()) bombCoords.add(new Point(i, j + 1));
                }
            }
        }

        for(int i = 0; i < grid.length; i++)
        {
            String fill = "";

            for(int j = 0; j < grid[i].length(); j++)
            {
                Point bombed = new Point(i, j);

                if(bombCoords.contains(bombed)) fill += '.';
                else fill += 'O';
            }

            grid[i] = fill;
        }

        return grid;
    }
}

// SOLVED //

/*
Bomberman lives in a rectangular grid. Each cell in the grid either contains a bomb or nothing at all.

Each bomb can be planted in any cell of the grid but once planted, it will detonate after exactly 3 seconds. Once a bomb
detonates, it's destroyed — along with anything in its four neighboring cells. This means that if a bomb detonates in
cell i, j, any valid cells (i ± 1, j) and (i, j ± 1) are cleared. If there is a bomb in a neighboring cell, the
neighboring bomb is destroyed without detonating, so there's no chain reaction.

Bomberman is immune to bombs, so he can move freely throughout the grid. Here's what he does:
1. Initially, Bomberman arbitrarily plants bombs in some of the cells, the initial state.
2. After one second, Bomberman does nothing.
3. After one more second, Bomberman plants bombs in all cells without bombs, thus filling the whole grid with bombs. No
bombs detonate at this point.
4. After one more second, any bombs planted exactly three seconds ago will detonate. Here, Bomberman stands back and
observes.
5. Bomberman then repeats steps 3 and 4 indefinitely.

Note that during every second Bomberman plants bombs, the bombs are planted simultaneously (i.e., at the exact same
moment), and any bombs planted at the same time will detonate at the same time.

Given the initial configuration of the grid with the locations of Bomberman's first batch of planted bombs, determine
the state of the grid after N seconds.

For example, if the initial grid looks like:
...
.O.
...

it looks the same after the first second. After the second second, Bomberman has placed all his charges:
OOO
OOO
OOO

At the third second, the bomb in the middle blows up, emptying all surrounding cells:
...
...
...

Input Format
The first line contains three space-separated integers r, c, and n, The number of rows, columns and seconds to simulate.
Each of the next r lines contains a row of the matrix as a single string of c characters. The "." character denotes an
empty cell, and the "O" character (ascii 79) denotes a bomb.

Output Format
Print the grid's final state. This means R lines where each line contains C characters, and each character is either a
"." or an "O" (ascii 79). This grid must represent the state of the grid after "n" seconds.

Sample Input
6 7 3
.......
...O...
....O..
.......
OO.....
OO.....

Sample Output
OOO.OOO
OO...OO
OOO...O
..OO.OO
...OOOO
...OOOO

Explanation

The initial state of the grid is:
.......
...O...
....O..
.......
OO.....
OO.....

Bomberman spends the first second doing nothing, so this is the state after 1 second:
.......
...O...
....O..
.......
OO.....
OO.....

Bomberman plants bombs in all the empty cells during his second second, so this is the state after 2 seconds:
OOOOOOO
OOOOOOO
OOOOOOO
OOOOOOO
OOOOOOO
OOOOOOO

In his third second, Bomberman sits back and watches all the bombs he planted 3 seconds ago detonate. This is the final
state after 3 seconds:
OOO.OOO
OO...OO
OOO...O
..OO.OO
...OOOO
...OOOO
*/