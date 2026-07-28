public class lc61_rotateList {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void insertAtHead(int data) {
        node n1 = new node(data);
        if (head == null) {
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    void printList() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "  =>  ");
            currNode = currNode.next;
        }
        System.out.println("  NULL");
    }

    node rotateList(node head, int k) {
        node temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        k = k % len;
        if (k == 0) {
            return head;
        }
        temp.next = head;
        int steps = len - k;
        node newTail = head;
        for(int i =1; i< steps; i++){
            newTail = newTail.next;
        }
        node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        lc61_rotateList lc61 = new lc61_rotateList();
        lc61.insertAtHead(5);
        lc61.insertAtHead(4);
        lc61.insertAtHead(3);
        lc61.insertAtHead(2);
        lc61.insertAtHead(1);
        lc61.head =  lc61.rotateList(lc61.head, 2);
        lc61.printList();
    }
}

// For left rotation means first appearing element will move at the back.
// for (int i = 0; i < k; ++i) {
// node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = head;
// temp = temp.next;
// head = head.next;
// temp.next = null;
// }

// For right rotation means last appearing element will move at the first. It
// hit TLE
// for (int i = 0; i < k; i++) {
// node temp = head;
// node prev = null;
// while (temp.next != null) {
// prev = temp;
// temp = temp.next;
// }
// prev.next = null;
// temp.next = head;
// head = temp;;
// temp = prev;
// }