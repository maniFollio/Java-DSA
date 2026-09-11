import java.util.HashMap;
import java.util.List;

public class lc17_LetterCombinationsofaPhoneNumber {
    public void letterCombinations(String digits) {
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        
    }

    public static void main(String[] args) {
        String digits = "23";
        lc17_LetterCombinationsofaPhoneNumber lc17 = new lc17_LetterCombinationsofaPhoneNumber();
        lc17.letterCombinations(digits);
    }
}
