public class delFromEnd {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Adding element at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "   =>   ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void delFromNthNode(int n) {
        Node slow = head;
        Node fast = head;

        if (head.next == null) {
            head = null;
            return;
        }

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            head = head.next;
            return;
        }
        
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
    }

    public static void main(String[] args) {
        lc19_delNthNodeFromEnd del = new lc19_delNthNodeFromEnd();

        del.addFirst(5);
        del.addFirst(4);
        del.addFirst(3);
        del.addFirst(2);
        del.addFirst(1);
        del.printList();

        del.delFromNthNode(2);
        del.printList();
        // del.delFromNthNode(1);
        // del.printList();
    }
}
