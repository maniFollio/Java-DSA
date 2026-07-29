public class lc82_removeDuplicateList {
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
    node duplicateList(node head){
        node dummy = new node(-1);
        dummy.next = head;
        node prev = dummy;
        node temp = head;
        while(temp != null){
            if(temp.next != null && temp.data == temp.next.data){
                while(temp.next != null && temp.data == temp.next.data ){
                    temp = temp.next;
                }
                prev.next = temp.next;
            } else {
                prev = prev.next;
            }
            temp = temp.next;
        }
        return dummy.next;
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
        lc82_removeDuplicateList lc82 = new lc82_removeDuplicateList();
        lc82.insertAtHead(5);
        lc82.insertAtHead(4);
        lc82.insertAtHead(4);
        lc82.insertAtHead(3);
        lc82.insertAtHead(2);
        lc82.insertAtHead(2);
        lc82.insertAtHead(1);
        lc82.printList();
        lc82.head = lc82.duplicateList(lc82.head);
        lc82.printList();
    } 
}
