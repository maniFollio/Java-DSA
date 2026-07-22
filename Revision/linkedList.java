// package Revision;

public class linkedList {
    node head;
    class node{
        int data;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void insertAtHead(int data){
        node n1 = new node(data);
        if(head == null){
            head = n1;
            return;
        }
        n1.next = head;
        head = n1;
    }

    void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "  =>  ");
            currNode = currNode.next;
        }
        System.out.println("  NULL");
    }

    public static void main(String[] args) {
        linkedList ll1 = new linkedList();
        ll1.insertAtHead(20);
        ll1.insertAtHead(10);
        ll1.printList();
    }
}
