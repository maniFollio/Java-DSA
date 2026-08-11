import java.util.HashMap;

public class lc219_containsDuplicateII {
    boolean containsDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIdx = map.get(nums[i]);
                if (i - prevIdx <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        int k = 3;
        lc219_containsDuplicateII lc219 = new lc219_containsDuplicateII();
        boolean res = lc219.containsDuplicate(arr, k);
        System.out.println(res);
    }
}