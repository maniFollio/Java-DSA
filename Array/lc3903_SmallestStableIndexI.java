public class lc3903_SmallestStableIndexI {
    public int firstStableIndex(int[] nums, int k) {
        int[] minArr = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        minArr[n-1] = nums[n-1];
        for (int i = n - 2; i >= 0; i--) {
            minArr[i] = Math.min(minArr[i + 1], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            if ((max - minArr[i]) <= k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 0, 1, 4 };
        int k = 3;
        lc3903_SmallestStableIndexI lc3903 = new lc3903_SmallestStableIndexI();
        int res = lc3903.firstStableIndex(arr, k);
        System.out.println(res);
        // lc3903.firstStableIndex(arr, k);
    }
}
