package net.nurbek.HackerRank.Algorithms.Implementation;

import java.util.Scanner;

public class P10_BonAppetit
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(i != k)
                sum += scan.nextInt();
            else
                scan.nextInt();
        }

        int charge = scan.nextInt();

        if(sum / 2 == charge) System.out.println("Bon Appetit");
        else System.out.println(charge - sum / 2);
    }
}

// SOLVED //

/*
Anna and Brian are sharing a meal at a restaurant and they agree to split the bill equally. Brian wants to order
something that Anna is allergic to though, and they agree that Anna won't pay for that item. Brian gets the check and
calculates Anna's portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2,4,6]. Anna declines to eat item k = bill[2] which
costs 6. If Brian calculates the bill correctly, Anna will pay (2 + 4) / 2 = 3. If he includes the cost of bill[2], he
will calculate (2 + 4 + 6) / 2 = 6. In the second case, he should refund 3 to Anna.

You are given an array of prices, bill, the cost of each of the n items, k, the item Anna doesn't eat, and b, the total
amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print "Bon Appetit".
Otherwise, print the integer amount of money that Brian must refund to Anna.

Sample Input 0
4 1
3 10 2 9
12

Sample Output 0
5

Explanation 0
Anna didn't eat item bill[1] = 10, but she shared the rest of the items with Brian. The total cost of the shared items
is 3 + 2 + 9 = 14 and, split in half, the cost per person is b[actual] = 7. Brian charged her b[charged] = 12 for her
portion of the bill. We print the amount Anna was overcharged, 12 - 7 = 5, on a new line.

Sample Input 1
4 1
3 10 2 9
7

Sample Output 1
Bon Appetit

Explanation 1
Anna didn't eat item bill[1] = 10, but she shared the rest of the items with Brian. The total cost of the shared items
is 3 + 2 + 9 = 14 and, split in half, the cost per person is b[actual] = 7. Because b[actual] = b[charged] = 7, we print
"Bon Appetit" on a new line.
*/
