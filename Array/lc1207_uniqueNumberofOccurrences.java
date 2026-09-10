import java.util.Arrays;
import java.util.HashMap;

public class lc1207_uniqueNumberofOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        int[] nums = new int[map.size()];
        int idx = 0;
        for (int val : map.values()) {
            nums[idx++] = val;
        } 
        // More Precised Approach tc is O(n) and not O(n log n)
        // for (int val : map.values()) {
        // if(set.contains(val)){
        // return false;
        // } else {
        // set.add(val);
        // }
        // }
        Arrays.sort(nums);
        for (int i = 0; i < idx - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        lc1207_uniqueNumberofOccurrences lc1207 = new lc1207_uniqueNumberofOccurrences();
        lc1207.uniqueOccurrences(arr);
    }

}
