import java.util.*;

public class lc13_romanToInt {
    int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int total = 0;

        // if(s.length() == 0) return; Not needed as leetcode mentioned. 
        for (int i = 1; i < s.length(); i++) {
            int r = map.get(s.charAt(i));
            int l = map.get(s.charAt(i - 1));
            if (l < r) {
                total = total - l;
            } else {
                total = total + l;
            }
        }
        int last = map.get(s.charAt(s.length()-1));
        return total + last;

        
        // System.out.println(total + last);
        // System.out.println(last);
    }

    public static void main(String[] args) {
        // String s = "LVIII";
        // String s = "III";
        // String s = "MCMXCIV";
        String s = "MCMIV";
        lc13_romanToInt lc13 = new lc13_romanToInt();
        lc13.romanToInt(s);
    }
}
