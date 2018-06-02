package net.nurbek.HackerRank.Algorithms.Implementation;

public class P22_AngryProfessor
{
    public static void main(String[] args)
    {
        System.out.println(angryProfessor(3, new int[]{-1, -3, 4, 2}).equals("YES"));
        System.out.println(angryProfessor(2, new int[]{0, -1, 2, 1}).equals("NO"));
        System.out.println(angryProfessor(4, new int[]{-93, -86, 49, -62, -90, -63, 40, 72, 11, 67}).equals("NO"));
        System.out.println(angryProfessor(10, new int[]{23, -35, -2, 58, -67, -56, -42, -73, -19, 37}).equals("YES"));
        System.out.println(angryProfessor(9, new int[]{13, 91, 56, -62, 96, -5, -84, -36, -46, -13}).equals("YES"));
        System.out.println(angryProfessor(8, new int[]{45, 67, 64, -50, -8, 78, 84, -51, 99, 60}).equals("YES"));
    }

    static String angryProfessor(int k, int[] a)
    {
        int count = 0;

        for(int min : a)
        {
            if(min <= 0) count++;
            if(count >= k) return "NO";
        }

        return "YES";
    }
}

// SOLVED //

/*
A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, he decides to cancel
class if fewer than some number of students are present when class starts.
Arrival times go from on time (arrivalTime <= 0) to arrived late (arrivalTime > 0).

Given the arrival time of each student, determine if the class is canceled.

Input Format
The first line of input contains "t", the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers, "n" (students in the class) and "k" (the cancellation threshold).
The second line contains "n" space-separated integers (a[1], ..., a[n]) describing the arrival times for each student.

Note: Non-positive arrival times (a[i] <= 0) indicate the student arrived early or on time; positive arrival times
(a[i] > 0) indicate the student arrived a[i] minutes late.

Output Format
For each test case, print the word YES if the class is canceled or NO if it is not.

Note
If a student arrives exactly on time (a[i] = 0), the student is considered to have entered before the class started.

Sample Input
2
4 3
-1 -3 4 2
4 2
0 -1 2 1

Sample Output
YES
NO
*/