import java.util.List;

public class lc206_revrseLinkedList {
    ListNode head;
    class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data);
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
        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "   =>   ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    ListNode revrseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public static void main(String[] args) {
        lc206_revrseLinkedList lc206 = new lc206_revrseLinkedList();
        lc206.addFirst(5);
        lc206.addFirst(4);
        lc206.addFirst(3);
        lc206.addFirst(2);
        lc206.addFirst(1);
        lc206.printList();
        ListNode list = lc206.revrseList(lc206.head);
        lc206.head = list;
        lc206.printList();
        
    }
}
