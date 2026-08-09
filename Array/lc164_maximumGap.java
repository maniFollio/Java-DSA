import java.util.Arrays;

public class lc164_maximumGap {
    void maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        int diff = 0;
        for (int i = 1; i < nums.length; i++) {
            diff = nums[i] - nums[i - 1];
            max = Math.max(max, diff);
            diff = 0;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 1 };
        lc164_maximumGap lc164 = new lc164_maximumGap();
        lc164.maximumGap(arr);
    }
}
