public class linkedListInsertion {
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

    void insertAtTail(int data) {
        node tail = new node(data);
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = tail;
    }

    void insertAtMiddle(int data, int pos) {
        node newNode = new node(data);
        node temp = head;
        if (pos == 1) {
            insertAtHead(data);
        }

        int count = 1; // Count is used for indexing to so, that it can stop
        while (count < pos - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next == null) {
            insertAtTail(data);
        }
        newNode.next = temp.next;
        temp.next = newNode;
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

    public static void main(String[] args) {
        linkedListInsertion ll1 = new linkedListInsertion();
        ll1.insertAtHead(30);
        ll1.insertAtHead(10);
        ll1.insertAtTail(40);
        ll1.insertAtMiddle(20, 2);
        ll1.printList();
    }
}
