public class nodesInList {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding element at first
    void addFirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Adding element at first
    void addLast(int data) {
        node newNode = new node(data);
        node tail = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    // Adding node at middle position
    void addAtAnyPosition(int pos, int data) {
        node newNode = new node(data);
        node temp = head;
        int count = 1;
        if (pos == 1) {
            addFirst(data);
            return;
        }

        while (count < (pos - 1)) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {
            addLast(data);
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Counting Total Nodes In the List
    void countNode() {
        node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        System.out.println("Number of Nodes in the List is " + count);
    }

    void middNode() {
        node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        // Standard Method
        // class Solution {
        // public ListNode middleNode(ListNode head) {
        // ListNode slowPointer = head, fastPointer = head;

        // while(fastPointer!= null && fastPointer.next != null) {
        // slowPointer = slowPointer.next;
        // fastPointer = fastPointer.next.next;
        // }

        // return slowPointer;

        // }
        // }

        int midd = (count / 2);
        int loop = 0;
        node middleNode = head;
        while (loop < midd) {
            middleNode = middleNode.next;
            loop++;
        }
        System.out.println("Middle Node is " + middleNode.data);
    }

    // Searching First Occuring Node
    void searchNode(int data) {
        node temp = head;
        int count = 1;
        while (temp != null) {
            if (temp.data == data) {
                System.out.println("Node " + data + " is Present in The List at Position " + count);
                return;
            }
            temp = temp.next;
            count++;
        }
        System.out.println("Node " + data + " is Not Present in The List.");
    }

    // Printing Node In the Linked List
    void printList() {
        // System.out.println();
        System.out.println("\nPrinting Linked List--");
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        nodesInList n1 = new nodesInList();
        n1.addFirst(10);
        n1.addFirst(5);
        n1.addLast(20);
        n1.addLast(25);
        n1.addAtAnyPosition(3, 15);
        n1.addLast(30);
        n1.addLast(35);
        n1.printList();
        System.out.println();
        n1.countNode();
        n1.searchNode(30);
        n1.middNode();
        System.out.println();
    }
}
