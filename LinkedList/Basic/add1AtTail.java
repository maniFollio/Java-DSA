// Delete Node In linnked List

// import java.util.Vector;

public class add1AtTail {
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

    node addTwoTail() {
        node srr = new node(0);
        node tail = srr;
        node temp = head;
        int carry = 0;
        int sum = 1;
        while (temp != null || carry != 0) {

            if (temp != null) {
                sum = temp.data + sum;
                temp = temp.next;
            }

            sum = sum + carry;
            carry = sum / 10;

            node dummy = new node(sum % 10);
            tail.next = dummy;
            tail = tail.next;
            sum =0;
        }
        head = srr.next;
        return head;
    }
    node rev(){
        node prev =null;
        node curr = head;
        while(curr != null){
            node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return head = prev;
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
        add1AtTail n1 = new add1AtTail();

        n1.addFirst(9);
        n1.addFirst(9);
        n1.addFirst(9);
        n1.printList();

        n1.addTwoTail();
        n1.printList();
        n1.rev();
        n1.printList();
    }
}
