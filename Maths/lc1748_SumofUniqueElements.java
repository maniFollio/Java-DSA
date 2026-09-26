import java.util.HashMap;

public class lc1748_SumofUniqueElements {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int sum = 0;
        for (int num : nums) {
            if (map.get(num) == 1) {
                sum += num;
            }
        }
        // for (int key : map.keySet()) {
        // // int val = map.get(key);
        // if (map.get(key) == 1) {
        // sum += key;
        // }
        // }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3 };
        lc1748_SumofUniqueElements lc1748 = new lc1748_SumofUniqueElements();
        System.out.println(lc1748.sumOfUnique(nums));
    }
}
