import java.util.List;

public class lc143_reorderList {
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

    ListNode reorderList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = head;
        dummy.next = head;
        ListNode curr = dummy;
        ListNode prev = null;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        temp = head;
        ListNode start = null;
        for (int i = 0; i < len / 2; i++) {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            curr = curr.next;
            curr.next = temp;
            temp = prev;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        lc143_reorderList lc143 = new lc143_reorderList();
        lc143.addFirst(4);
        lc143.addFirst(3);
        lc143.addFirst(2);
        lc143.addFirst(1);
        lc143.printList();
        ListNode res = lc143.reorderList(lc143.head);
        lc143.head = res;
        lc143.printList();
    }
}
