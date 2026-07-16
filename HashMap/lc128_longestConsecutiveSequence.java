import java.util.HashSet;

public class lc128_longestConsecutiveSequence {
    void consecutiveSequence(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;
        for (int val : nums) {
            set.add(val);
        }
        for (int val : set) {
            if (!set.contains(val - 1)) {
                int count = 0;
                int curr = val;
                while (set.contains(curr)) {
                    count++;
                    curr++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println(maxCount);
        // System.out.println(set);
        // System.out.println(n);

    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        // int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        lc128_longestConsecutiveSequence lc128 = new lc128_longestConsecutiveSequence();
        lc128.consecutiveSequence(nums);
    }
}
