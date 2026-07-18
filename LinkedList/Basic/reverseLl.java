public class reverseLl {
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

    //Reverse Linked List
    public void reverseList(){
        Node prev = head;
        Node curr = head.next;

        if(head == null || head.next == null){
            return;
        }
        
        while( curr != null){
            Node next = curr.next;
            curr.next = prev;

            // Update Node
            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }

    // Printing Linked List
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
        reverseLl l1 = new reverseLl();

        l1.addFirst(16);
        l1.addFirst(42);
        l1.addFirst(36);
        l1.addFirst(35);
        l1.addFirst(98);
        l1.printList();

        l1.reverseList();
        l1.printList();
    }
}
