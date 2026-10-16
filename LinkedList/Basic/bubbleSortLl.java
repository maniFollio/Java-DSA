//Sorting Linked List Via Bubble Sort Algorithm. 

//Note:---> Not a good approch as it takes extra space and time complexity.

import java.util.ArrayList;

public class bubbleSortLl {
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

    // Sorting
    void sorting() {
        node temp = head;
        ArrayList<Integer> num = new ArrayList<>();
        while (temp != null) {
            num.add(temp.data);
            temp = temp.next;
        }
        int count = num.size();
        // System.out.println("Size Of The Array: " + count);

        // System.out.println("The Array: ");
        // for (int i = 0; i < count; i++) {
        //     System.out.print(num.get(i) + " ");
        // }

        // System.out.println("\nSorted Array:");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (num.get(j) > num.get(j + 1)) {
                    int now=num.get(j);
                    num.set(j, num.get(j+1));
                    num.set(j+1, now);
                }
            }
        }
        // System.out.println(num);

        temp=head;
        for (int k = 0;temp != null; k++) {
            temp.data=num.get(k);
            temp = temp.next;
        }
        System.out.println("Sorted Linked List: ");
    }

    void printList() {
        System.out.println("Printing Linked List--");
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        bubbleSortLl n1 = new bubbleSortLl();
        n1.addFirst(14);
        n1.addFirst(0);
        n1.addFirst(3);
        n1.addFirst(9);
        n1.addFirst(2);
        n1.addFirst(5);
        n1.printList();
        
        //Sorted Linked List
        n1.sorting();
        n1.printList();
        System.out.println();
    }
}





// Swapping only for Two nodes.
// void swappping() {
// System.out.println("\nPrinting Swapping Of Linked List--");

// node a = head;
// node b = head.next;
// a.next = b.next;
// b.next = a;
// head = b;

// }