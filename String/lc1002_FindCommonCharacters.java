import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class lc1002_FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<Character, > set = new HashSet<>();
        for (char ch : words[0].toCharArray()) {
            set.add(ch);
        }
        for (int i = 1; i < words.length; i++) {
            for(char c : words[i].toCharArray()){
                if(set.contains(c)){

                }

            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = { "bella", "label", "roller" };
        lc1002_FindCommonCharacters lc1002 = new lc1002_FindCommonCharacters();
        System.out.println(lc1002.commonChars(words));
    }
}
