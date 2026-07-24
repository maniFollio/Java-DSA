public class linkedListDeletion {
    node head;

    class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void addAtfirst(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void delAtFirst(){
        node temp = head;
        temp = temp.next;
        head = temp;
    }

    void delAtLast(){
        node tail = null;
        node temp = head;
        while(temp.next != null){
            tail = temp;
            temp = tail.next;
        }
        tail.next = null;
    }

    void delAtAnyPosition(int pos){
        if(pos == 1){
            delAtFirst();
            return;
        }
        node temp = head;
        int count = 1;
        while(count < pos-1){
            temp = temp.next;
            count++;
        }

        if(temp.next == null){
            delAtLast(); 
            return;
        }

        temp.next = temp.next.next;
    }
    void printList() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "  =>  ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        linkedListDeletion lld = new linkedListDeletion();
        lld.addAtfirst(25);
        lld.addAtfirst(20);
        lld.addAtfirst(15);
        lld.addAtfirst(10);
        lld.addAtfirst(5);
        // lld.delAtFirst();
        // lld.delAtLast();
        lld.delAtAnyPosition(3);
        lld.printList();
    }
}
