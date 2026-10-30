public class lc896_monotonicArray {
    class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < nums.length; i++) {
            // If the current element is smaller than the previous, it cannot be monotonic increasing
            if (nums[i] < nums[i - 1]) {
                increasing = false;
            }
            // If the current element is larger than the previous, it cannot be monotonic decreasing
            if (nums[i] > nums[i - 1]) {
                decreasing = false;
            }
            // Early exit optimization: if it's neither, we can return false immediately
            if (!increasing && !decreasing) {
                return false;
            }
        }

        return increasing || decreasing;
    }
}

}
