public class lc92_revrseInBetween {
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

    public ListNode revrseInBetwwen(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        int i;
        for (i = 1; i < left; i++) {
            prev = curr;
            curr = curr.next;
        }
        ListNode leftList = prev;
        ListNode revrseTail = curr;
        prev = null;

        while (i <= right) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }
        if (leftList != null) {
            leftList.next = prev;
        } else {
            head = prev;
        }
        revrseTail.next = curr;
        return head;
    }

    public static void main(String[] args) {
        lc92_revrseInBetween lc92 = new lc92_revrseInBetween();
        lc92.addFirst(5);
        lc92.addFirst(4);
        lc92.addFirst(3);
        lc92.addFirst(2);
        lc92.addFirst(1);
        lc92.printList();
        ListNode node = lc92.revrseInBetwwen(lc92.head, 2, 4);
        lc92.head = node;
        lc92.printList();
    }
}
