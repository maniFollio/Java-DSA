import java.util.LinkedList;
import java.util.Queue;

public class lc2073_TimeNeededtoBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < tickets.length; i++) {
            q.offer(i);
        }
        int time = 0;
        while (!q.isEmpty()) {
            int front = q.poll();
            tickets[front]--;
            time++;
            if (tickets[front] == 0 && front == k) {
                return time;
            }
            if (tickets[front] > 0) {
                q.offer(front);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] tickets = { 2, 3, 2 };
        int k = 2;
        lc2073_TimeNeededtoBuyTickets lc2073 = new lc2073_TimeNeededtoBuyTickets();
        int ans = lc2073.timeRequiredToBuy(tickets, k);
        System.out.println(ans);
    }

}
