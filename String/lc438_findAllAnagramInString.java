import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc438_findAllAnagramInString {
    void findAnagram(String s, String t){
        List<Integer> list = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        int left = 0;
        for(int j = 0; j < t.length(); j++){
            set.add(t.charAt(j));
        }
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String t = "abc";
        lc438_findAllAnagramInString lc438 = new lc438_findAllAnagramInString();
        lc438.findAnagram(s, t);
    }
}
