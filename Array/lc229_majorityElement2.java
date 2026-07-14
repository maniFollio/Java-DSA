import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc229_majorityElement2 {
    List<Integer> majorityElementII(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int val = nums[i];
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 3) {
                list.add(key);
            }
        }
        //It is bit complex to understand.
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > n / 3) {
        // System.out.println(entry.getKey());
        // list.add(entry.getKey());
        // }
        // }
        return list;
        // System.out.println(map.values());
        // System.out.println(map);
    }

    public static void main(String[] args) {
        // int[] arr = { 3, 2, 3 };
        int[] arr = { 2, 2, 9, 3, 9, 3, 9, 3, 9 };
        lc229_majorityElement2 lc229 = new lc229_majorityElement2();
        lc229.majorityElementII(arr);
    }
}