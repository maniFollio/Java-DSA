public class lc203_removeLinkedListElements {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Insert At Head
    void insertAtHead(int data) {
        ListNode n1 = new ListNode(data);
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
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val + "  =>  ");
            currNode = currNode.next;
        }
        System.out.println("  NULL");
    }

    ListNode linkedListElements(ListNode head, int data) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        if(head == null) return null;

        while (temp != null) {
            if (temp.val != data) {
                curr.next = temp;
                curr = curr.next;
            }
            temp = temp.next;
        }
        curr.next = null;
        return dummy.next;
    }

    public static void main(String[] args) {
        lc203_removeLinkedListElements lc203 = new lc203_removeLinkedListElements();
        // lc203.insertAtHead(6);
        // lc203.insertAtHead(5);
        // lc203.insertAtHead(4);
        // lc203.insertAtHead(3);
        // lc203.insertAtHead(6);
        // lc203.insertAtHead(2);
        // lc203.insertAtHead(1);
        lc203.insertAtHead(7);
        lc203.insertAtHead(7);
        lc203.insertAtHead(7);
        lc203.insertAtHead(7);
        lc203.printList();
        // lc203.linkedListElements(lc203.head, 7);
        ListNode list = lc203.linkedListElements(lc203.head, 7);
        lc203.head = list;
        lc203.printList();
    }
}
