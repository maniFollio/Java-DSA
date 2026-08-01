public class lc234_palindromeLinkedList {
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

    boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        temp = head;
        int[] arr1 = new int[len];
        int i = 0;
        while (temp != null) {
            arr1[i++] = temp.data;
            temp = temp.next;
        }
        // Now reverse
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        for (int j = 0; j < len; j++) {
            if (arr1[j] != prev.data) {
                return false;
            }
            prev = prev.next;
        }
        return true;
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
        // System.out.println(len);
    }

    public static void main(String[] args) {
        lc234_palindromeLinkedList lc234 = new lc234_palindromeLinkedList();
        lc234_palindromeLinkedList lc234b = new lc234_palindromeLinkedList();
        lc234.addFirst(1);
        lc234.addFirst(2);
        lc234.addFirst(2);
        lc234.addFirst(1);
        // lc234.printList();
        boolean res = lc234.isPalindrome(lc234.head);
        System.out.println(res);
    }
}
