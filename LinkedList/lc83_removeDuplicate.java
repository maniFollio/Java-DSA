public class lc83_removeDuplicate {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert At Head
    void insertAtHead(int data) {
        node n1 = new node(data);
        if (head == null) {
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    // Print list
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

    node removeDuplicate(node head) {
        node temp = head;
        if(head == null){
            return null;
        }
        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        lc83_removeDuplicate lc83 = new lc83_removeDuplicate();
        lc83.insertAtHead(2);
        lc83.insertAtHead(1);
        lc83.insertAtHead(1);
        node list = lc83.removeDuplicate(lc83.head);
        lc83.head = list;
        lc83.printList();

    }
}
