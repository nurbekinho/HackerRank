package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P40_AcmIcpcTeam
{
    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11110", "00010"})));
        System.out.println(Arrays.toString(acmTeam(new String[]{"10101", "11100", "11010", "00101"})));
    }

    static int[] acmTeam(String[] topic)
    {
        int[] result = new int[2];
        int max = 0;
        Map<Integer, Integer> stats = new HashMap();

        for(int i = 0; i < topic.length - 1; i++)
        {
            for(int j = i + 1; j < topic.length; j++)
            {
                int count = 0;

                for(int c = 0; c < topic[i].length(); c++)
                {
                    if(topic[i].charAt(c) == '1' || topic[j].charAt(c) == '1') count++;
                }

                if(stats.containsKey(count)) stats.put(count, stats.get(count) + 1);
                else stats.put(count, 1);

                if(count > max) max = count;
            }
        }

        result[0] = max;
        result[1] = stats.get(max);

        return result;
    }
}

// SOLVED //

/*
There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a number of
topics. Given a list of topics known by each attendee, you must determine the maximum number of topics a 2-person team
can know. Also find out how many ways a team can be formed to know that many topics. Lists will be in the form of bit
strings, where each string represents an attendee and each position in that string represents a field of knowledge, 1 if
its a known field or 0 if not.

For example, given three attendees' data as follows:
10101
11110
00010

These are all possible teams that can be formed:
Members Subjects
(1,2)   [1,2,3,4,5]
(1,3)   [1,3,4,5]
(2,3)   [1,2,3,4]

In this case, the first team will know all 5 subjects. They are the only team that can be created knowing that many
subjects.

Input Format
The first line contains two space-separated integers n and m, where n represents the number of attendees and m represents
the number of topics.

Each of the next n lines contains a binary string of length m. If the i-th line's j-th character is 1, then the i-th
person knows the j-th topic.

Output Format
On the first line, print the maximum number of topics a 2-person team can know.
On the second line, print the number of ways to form a 2-person team that knows the maximum number of topics.

Sample Input
4 5
10101
11100
11010
00101

Sample Output
5
2

Explanation
Calculating topics known for all permutations of 2 attendees we get:
(1, 2) -> 4
(1, 3) -> 5
(1, 4) -> 3
(2, 3) -> 4
(2, 4) -> 4
(3, 4) -> 5

The 2 teams (1, 3) and (3, 4) know all 5 topics which is maximal.
*/