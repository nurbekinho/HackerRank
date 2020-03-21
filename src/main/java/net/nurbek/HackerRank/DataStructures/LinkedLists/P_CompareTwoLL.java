package net.nurbek.HackerRank.DataStructures.LinkedLists;

public class P_CompareTwoLL {
    public static void main(String[] args) {
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1);
        n1.next = new SinglyLinkedListNode(2);
        n1.next.next = new SinglyLinkedListNode(3);

        SinglyLinkedListNode n2 = new SinglyLinkedListNode(1);
        n2.next = new SinglyLinkedListNode(2);
        n2.next.next = new SinglyLinkedListNode(3);

        System.out.println(compareLists(n1, n2)); // Expect true

        n2.next.next = new SinglyLinkedListNode(4);

        System.out.println(compareLists(n1, n2)); // Expect false
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) return true;
        if (head1 == null || head2 == null) return false;
        if (head1.data != head2.data) return false;

        return compareLists(head1.next, head2.next);
    }
}

// SOLVED //