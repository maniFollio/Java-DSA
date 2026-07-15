import java.util.HashMap;

public class lc387_firstUniqueElement {
    int uniqueElement(String str) {
        HashMap<Character, Integer> linkedMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (linkedMap.containsKey(ch)) {
                linkedMap.put(ch, linkedMap.get(ch) + 1);
            } else {
                linkedMap.put(ch, 1);
            }
        }
        System.out.println(linkedMap);
        for (int idx = 0; idx < str.length(); idx++) {
            if (linkedMap.get(str.charAt(idx)) == 1) {
                return idx;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String str = "loveleetcode";
        lc387_firstUniqueElement lc387 = new lc387_firstUniqueElement();
        int res = lc387.uniqueElement(str);
        System.out.println(res);
    }
}
