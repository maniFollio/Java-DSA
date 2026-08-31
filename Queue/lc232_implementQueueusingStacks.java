import java.util.Stack;

public class lc232_implementQueueusingStacks {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public lc232_implementQueueusingStacks() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    void push(int x) {
        st1.push(x);
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public int pop() {
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.pop();
    }

    public int peek() {
        if (st1.isEmpty()) {
            return -1;
        }
        return st1.peek();
    }

    public boolean empty() {
        return st1.isEmpty();
    }
    public static void main(String[] args) {
        lc232_implementQueueusingStacks lc232 = new lc232_implementQueueusingStacks();
        lc232.push(10);
        lc232.push(20);
        lc232.push(30);
    }
}
