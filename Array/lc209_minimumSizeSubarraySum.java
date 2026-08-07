public class lc209_minimumSizeSubarraySum {
    int minimumSizeSubarraySum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        int left = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                minCount = Math.min(minCount, i - left +1);
                sum -= nums[left];
                left++;
            }
        }
        System.out.println(minCount);
        return minCount == Integer.MAX_VALUE ? 0: minCount;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        lc209_minimumSizeSubarraySum lc209 = new lc209_minimumSizeSubarraySum();
        lc209.minimumSizeSubarraySum(arr, 7);
    }
}
