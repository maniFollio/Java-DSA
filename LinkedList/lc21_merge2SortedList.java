public class lc21_merge2SortedList {
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
    // Merge the List
    node mergeList(node head1, node head2) {
        node temp1 = head1;
        node temp2 = head2;
        node dummy = new node(-1);
        node curr = dummy;
        while(temp1 != null && temp2 != null){
            if(temp1.data <= temp2.data){
                curr.next = temp1;
                temp1 = temp1.next;
            } else {
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        if(temp1 != null){
            curr.next = temp1;
        } else {
            curr.next = temp2;
        }
        return head = dummy.next;
    }

    public static void main(String[] args) {
        lc21_merge2SortedList lc21 = new lc21_merge2SortedList();
        lc21_merge2SortedList lc21b = new lc21_merge2SortedList();
        lc21.insertAtHead(4);
        lc21.insertAtHead(2);
        lc21.insertAtHead(1);
        // lc21.printList();

        lc21b.insertAtHead(4);
        lc21b.insertAtHead(3);
        lc21b.insertAtHead(1);
        // lc21b.printList();

        lc21.mergeList(lc21.head, lc21b.head);
        lc21.printList();
    }
}
