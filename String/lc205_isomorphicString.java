import java.util.HashMap;

public class lc205_isomorphicString {
    void isomorphicString(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (!map1.containsKey(ch1)) {
                map1.put(ch1, i);
            }

            if (!map2.containsKey(ch2)) {
                map2.put(ch2, i);
            }

            if (!map1.get(ch1).equals(map2.get(ch2))) {
                System.out.println("Not Isomarphic String");
                return;
            }
        }
        System.out.println("Isomorphic String");
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        lc205_isomorphicString lc205 = new lc205_isomorphicString();
        lc205.isomorphicString(s, t);
    }
}
