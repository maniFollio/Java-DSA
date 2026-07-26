public class lc24_swapNodes {
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

    Node swapNode(Node head){
        Node temp = head;
        // while(temp != null && temp.next != null){
        //     int val = temp.data;
        //     temp.data = temp.next.data;
        //     temp.next.data = val;
        //     temp = temp.next.next;
        // }
        while(temp != null && temp.next != null){
            Node val = temp;
            temp = temp.next;
            Node val2 = temp.next;
            temp.next = val;
            temp = val2.next;
        }
        return head;
    }

    public static void main(String[] args) {
        lc24_swapNodes lc24 = new lc24_swapNodes();
        lc24.addFirst(4);
        lc24.addFirst(3);
        lc24.addFirst(2);
        lc24.addFirst(1);
        lc24.printList();
        lc24.swapNode(lc24.head);
        lc24.printList();
    }
}
