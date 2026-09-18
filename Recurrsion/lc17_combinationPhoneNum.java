import java.util.ArrayList;
import java.util.List;

public class lc17_combinationPhoneNum {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        String current = "";
        int index = 0;
        solve(digits, ans, map, index, current);
        return ans;
    }

    void solve(String digits, List<String> ans, String[] map, int index, String current) {
        if (digits.length() == index) {
            ans.add(current);
            return;
        }
        int val = digits.charAt(index) - '0';
        String temp = map[val];
        for (int i = 0; i < temp.length(); i++) {
            solve(digits, ans, map, index + 1, current + temp.charAt(i));
        }
    }
}
