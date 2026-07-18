// Delete Middle Node In linnked List

import java.util.Vector;

public class lc2095_deleteMiddNode {
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

    // Mid Ndode Deleteion Optimal Approach, Space compexity is O(1) and Time complexity O(n).
    public node del(){

        node slow = head;
        node fast = head;
        node temp = null;

        while(fast != null && fast.next != null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
        
        return head;
    }

    // Brute Force Approach, Not Optimal space complixity is O(n).
    //     if(head == null){
    //         return null;
    //     }
    //     if(head.next==null){
    //         return head.next;
    //     }
    //     int count = 1;
    //     node temp = head;
    //     while(temp.next != null){
    //         temp = temp.next;
    //         count++;
    //     }
    //     // System.out.println(count);
    //     int mid = (count/2)+1;
    //     temp = head;
    //     count = 1;
    //     while(count < mid-1){
    //         temp = temp.next;
    //         count++;
    //     }
    //     temp.next= temp.next.next;
    // }

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
        lc2095_deleteMiddNode n1 = new lc2095_deleteMiddNode();
        n1.addFirst(6);
        n1.addFirst(2);
        n1.addFirst(1);
        n1.addFirst(7);
        n1.addFirst(4);
        n1.addFirst(3);
        n1.addFirst(1);
        n1.printList();
        n1.del();
        n1.printList();  
    }
}
