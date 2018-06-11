package net.nurbek.HackerRank.Algorithms.Strings;

public class P12_GemStones
{
    public static void main(String[] args)
    {
        String[] arr = {"abcdde", "baccd", "eeabg"};

        System.out.println(2 == gemstones(arr));
    }

    static int gemstones(String[] arr)
    {
        int count = 0;
        for(Character c : "abcdefghijklmnopqrstuvwxyz".toCharArray())
        {
            for(String s : arr)
            {
                if(s.indexOf(c) < 0)
                {
                    count--;
                    break;
                }
            }

            count++;
        }

        return (count <= 0) ? 0 : count;
    }
}

// SOLVED //

/*
John has collected various rocks. Each rock has various minerals embedded in it. Each type of mineral is designated by a
lowercase letter in the range ascii[a-z]. There may be multiple occurrences of a mineral in a rock. A mineral is called
a gemstone if it occurs at least once in each of the rocks in John's collection.

Given a list of minerals embedded in each of John's rocks, display the number of types of gemstones he has in his
collection.

Input Format
The first line consists of an integer "n", the number of rocks.
Each of the next "n" lines contains a string where each letter represents an occurence of a mineral in the current rock.

Output Format
Print the number of types of gemstones in John's collection. If there are none, print 0.

Sample Input
3
abcdde
baccd
eeabg

Sample Output
2

Explanation
Only "a" and "b" are gemstones. They are the only types that occur in every rock.
*/