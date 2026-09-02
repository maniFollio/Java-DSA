import java.util.LinkedList;
import java.util.Queue;

public class lc933_numberOfRecentCall {
    Queue<Integer> q;

    public lc933_numberOfRecentCall() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.offer(t);
        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }
        return q.size();
    }
}
