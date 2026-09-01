import java.util.LinkedList;
import java.util.Queue;

public class lc225_ImplementStackusingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;

    lc225_ImplementStackusingQueues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    void push(int x) {
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(x);
        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }
    }

    int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.poll();
    }

    boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        lc225_ImplementStackusingQueues lc225 = new lc225_ImplementStackusingQueues();
        lc225.push(10);
        lc225.push(20);
        lc225.push(30);
        lc225.push(40);
        lc225.push(50);
        int top = lc225.top();
        int pop = lc225.pop();
        boolean emp = lc225.empty();
        System.out.println("top = " + top);
        System.out.println("popped = " + pop);
        System.out.println("Is Empty ?  " + emp);
    }
}
