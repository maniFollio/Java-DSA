public class ImplementationOfQueue {
    int[] arr;
    int front;
    int rear;
    int size;

    ImplementationOfQueue(int capacity) {
        this.arr = new int[capacity];
        size = 0;
        this.front = 0;
        this.rear = -1;
    }

    void offer(int value) {
        if (size == arr.length) {
            System.out.println("Queue Is Full");
            return;
        }
        rear++;
        arr[rear] = value;
        size++;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        System.out.println(arr[front]);
        return arr[front];
    }

    int poll() {
        if (size == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        int del = arr[front];
        front++;
        size--;
        System.out.println(del);
        return del;
    }

    boolean isEmpty() {
        if (size == 0) {
            System.out.println("Queue Is Empty");
        }
        return size == 0;
    }

    void printArr() {
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ImplementationOfQueue q = new ImplementationOfQueue(5);
        q.offer(10);
        q.offer(15);
        q.offer(20);
        q.offer(25);
        q.offer(30);
        q.printArr();
        q.poll();
        q.printArr();
        q.peek();
    }
}
