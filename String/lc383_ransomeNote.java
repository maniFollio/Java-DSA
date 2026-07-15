import java.util.HashMap;

public class lc383_ransomeNote {
    boolean isRansomeNote(String r, String m) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < r.length(); i++) {
            char ch1 = r.charAt(i);
            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);
            } else {
                map1.put(ch1, 1);
            }
        }

        for (int j = 0; j < m.length(); j++) {
            char ch2 = m.charAt(j);
            if (map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2) + 1);
            } else {
                map2.put(ch2, 1);
            }
        }

        for (int k = 0; k < r.length(); k++) {
            char ch3 = r.charAt(k);

            if (!map2.containsKey(ch3)) {
                System.out.println(ch3 + " is not present");
                return false;
            }

            if (map1.get(ch3) > (map2.get(ch3))) {
                System.out.println("Shit! Not ransome note");
                return false;
            }
        }
        // System.out.println(map1);
        // System.out.println(map2);
        // System.out.println("Yay! Ransome note");
        return true;
    }

    public static void main(String[] args) {
        // String r = "aa";
        // String r = "aa";
        String r = "aa";
        String m = "ab";
        lc383_ransomeNote lc383 = new lc383_ransomeNote();
        lc383.isRansomeNote(r, m);
    }
}
