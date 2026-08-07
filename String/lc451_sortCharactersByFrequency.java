import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class lc451_sortCharactersByFrequency {
    String sortByFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        List<Character>[] bucket = new List[s.length() + 1];
        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        char[] cArr = new char[s.length()];
        int idx = 0; 
        for (int i = bucket.length - 1; i > 0; i--) {
            if (bucket[i] != null) {
                for (char chr : bucket[i]) {
                    for (int j = 0; j < i; j++) {
                        cArr[idx++] = chr;
                    } 
                }
            }
        }
        return new String(cArr);
    }

    public static void main(String[] args) {
        String s = "tree";
        lc451_sortCharactersByFrequency lc451 = new lc451_sortCharactersByFrequency();
        String res = lc451.sortByFrequency(s);
        System.out.println(res);
    }
}
