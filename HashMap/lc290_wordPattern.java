import java.util.HashMap;

public class lc290_wordPattern {
    boolean isWordPattern(String pattern, String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        HashMap <String, Integer> map2 = new HashMap<>();
        String[] str = s.split(" ");

        if(str.length != pattern.length()){
            return false;
        }

        for(int i =0; i < str.length; i++){
            char val = pattern.charAt(i);
            String st = str[i];

            if(!map.containsKey(val)){
                map.put(val, i);
            } 

            if(!map2.containsKey(st)){
                map2.put(st, i);
            } 

            if(!map.get(val).equals(map2.get(st))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        lc290_wordPattern lc290 = new lc290_wordPattern();
        boolean res = lc290.isWordPattern(pattern, s);
        System.out.println(res);
    }
}
