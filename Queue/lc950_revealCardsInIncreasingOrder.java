import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class lc950_revealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        int[] ans = new int[deck.length];
        Arrays.sort(deck);
        for (int i = 0; i < deck.length; i++) {
            q.offer(i);
        }
        for (int i = 0; i < deck.length; i++) {
            int del = q.poll();
            ans[del] = deck[i];
            if (!q.isEmpty()) {
                q.offer(q.poll());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] deck = { 17, 13, 11, 2, 3, 5, 7 };
        lc950_revealCardsInIncreasingOrder lc950 = new lc950_revealCardsInIncreasingOrder();
        int[] res = lc950.deckRevealedIncreasing(deck);
        System.out.println(Arrays.toString(res));
    }

}
