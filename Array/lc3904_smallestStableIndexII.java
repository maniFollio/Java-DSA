public class lc3904_smallestStableIndexII {
    int smallestStableIndexII(int[] nums, int k) {
        int res = -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] minArr = new int[nums.length];
        minArr[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            minArr[i] = Math.min(nums[i], minArr[i + 1]);
        }
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
            if(max - minArr[i] <= k){
                res = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 4 };
        int k = 3;
        lc3904_smallestStableIndexII lc3904 = new lc3904_smallestStableIndexII();
        int ans = lc3904.smallestStableIndexII(nums, k);
        System.out.println(ans);
    }
}
