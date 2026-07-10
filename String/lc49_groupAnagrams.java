import java.util.*;

public class lc49_groupAnagrams {
    List<List<String>> groupAnagram(String[] s){
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: s){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch);
        
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(str);
        }
        System.out.println(map.values());
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        lc49_groupAnagrams lc49 = new lc49_groupAnagrams();
        lc49.groupAnagram(s);
    }
}
