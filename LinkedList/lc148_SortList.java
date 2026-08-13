import java.util.Arrays;

public class lc148_SortList {
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

    ListNode sortList(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int[] arr = new int[len];
        int idx = 0;
        temp = head;
        while (temp != null) {
            arr[idx] = temp.data;
            temp = temp.next;
            idx++;
        }
        Arrays.sort(arr);
        temp = head;
        idx = 0;
        while (temp != null) {
            temp.data = arr[idx];
            temp = temp.next;
            idx++;
        }
        return head;
    }

    public static void main(String[] args) {
        lc148_SortList lc148 = new lc148_SortList();
        // lc148.addFirst(3);
        // lc148.addFirst(1);
        // lc148.addFirst(2);
        // lc148.addFirst(4);
        lc148.addFirst(0);
        lc148.addFirst(4);
        lc148.addFirst(3);
        lc148.addFirst(5);
        lc148.addFirst(-1);
        lc148.printList();
        ListNode ans = lc148.sortList(lc148.head);
        lc148.head = ans;
        lc148.printList();
    }
}
