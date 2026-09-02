import java.util.LinkedList;
import java.util.Queue;

public class lc649_Dota2Senate {
    String dota2Senate(String senate){
        Queue<Integer> rQ1 = new LinkedList<>();
        Queue<Integer> dQ2 = new LinkedList<>();
        for(int i = 0; i < senate.length(); i++){
            if( senate.charAt(i) == 'R'){
                rQ1.offer(i);
            }
            else {
                dQ2.offer(i);
            }
        }
        while(!rQ1.isEmpty() && !dQ2.isEmpty()){
            int rIdx = rQ1.poll();
            int dIdx = dQ2.poll();
            if(rIdx< dIdx){
                rQ1.offer(rIdx + senate.length());
            } else {
                dQ2.offer(dIdx + senate.length());
            }
        }
        return rQ1.isEmpty() ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        // String s = "DRR";
        String s = "RDD";
        lc649_Dota2Senate lc649 = new lc649_Dota2Senate();
        String res = lc649.dota2Senate(s);
        System.out.println(res);
    }
}
