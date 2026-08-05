public class CountLengthofList {
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
    int getListLength(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        CountLengthofList count = new CountLengthofList();
        count.addFirst(5);
        count.addFirst(4);
        count.addFirst(3);
        count.addFirst(2);
        count.addFirst(1);
        count.printList();
        int len = count.getListLength(count.head);
        System.out.println(len);
    }
}
