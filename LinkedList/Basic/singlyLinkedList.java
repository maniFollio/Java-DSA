// Insertion and Deletion of Nodes at Head, Tail and any Position in Singly Linked List.

class singlyLinkedList {
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

    // Adding element at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        Node tail = head;
        if (head == null) {
            head = newNode;
            return;
        }
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = newNode;
    }

    // Adding element at any Position
    public void addAtAnyPosition(int pos, int data) {
        if (pos == 1) {
            addFirst(data);
            return;
        }
        Node temp = head;
        Node newNode = new Node(data);
        int count = 1;
        while (count < (pos - 1)) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {

            addLast(data);
            return;
        }

        // Adding element in between
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at First Position
    public void deleteAtHead() {

        Node temp = head;
        temp = temp.next;
        head = temp;
    }

    // Delete at End Position
    public void deleteAtTail() {
        Node temp = head;
        Node tail = null;
        while (temp.next != null) {
            tail = temp;
            temp = temp.next;
        }
        tail.next = null;
    }

    // Adding element at any Position
    public void deleteAtAnyPosition(int pos) {
        Node temp = head;
        Node prev = null;
        int count = 1;
        while (count < pos) {
            prev = temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
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

    public static void main(String[] args) {
        singlyLinkedList l1 = new singlyLinkedList();

        l1.addFirst(35);
        l1.addFirst(98);
        l1.addLast(42);
        // l1.printList();
        l1.addAtAnyPosition(3, 36);
        // l1.printList();
        l1.addAtAnyPosition(5, 16);
        // l1.printList();
        l1.addAtAnyPosition(3, 55);
        l1.printList();
        // l1.deleteAtHead();
        // l1.printList();
        // l1.deleteAtTail();
        // l1.printList();
        l1.deleteAtAnyPosition(3);
        l1.printList();
    }
}
