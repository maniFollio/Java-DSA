import java.util.HashMap;

public class lc136_SingleNumber {
    void singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val == 1) {
                System.out.println(key);
                return;
            }
        }
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 2, 1 };
        int[] nums = { 4, 1, 2, 1, 2 };
        lc136_SingleNumber lc136 = new lc136_SingleNumber();
        lc136.singleNumber(nums);
    }
}
