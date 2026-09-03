public class lc622_designCircularQueue {
    int[] arr;
    int size;
    int front;
    int rear;

    public lc622_designCircularQueue(int k) {
        this.arr = new int[k];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    public boolean enQueue(int value) {
        if (size == arr.length) {
            return false;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (size == 0) {
            return false;
        }
        front = (front + 1) % arr.length;
        size--;
        return true;
    }

    public int Front() {
        if (size == 0) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (size == 0) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}
