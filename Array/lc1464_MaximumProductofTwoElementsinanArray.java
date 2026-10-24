import java.util.Arrays;

public class lc1464_MaximumProductofTwoElementsinanArray {
    public int maxProduct(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] - 1;
        }
        int max = Integer.MIN_VALUE;
        Arrays.sort(res);
        for (int i = 0; i < nums.length-1; i++) {
            int x = res[i] * res[i + 1];
            max = Math.max(x, max);
        }
        return max;
    }
}