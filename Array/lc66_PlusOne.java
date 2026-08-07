import java.util.Arrays;

public class lc66_PlusOne {
    int[] plusOne(int[] nums) {
        int carry = 0;
        int digit = 0;
        int idx = nums.length + 1;
        int[] ans = new int[idx];
        nums[nums.length - 1] += 1;
        for (int i = nums.length - 1; i >= 0;) {
            int n = nums[i];
            if (nums[i] == 10) {
                carry = n / 10;
                digit = n % 10;
                ans[idx--] = digit;
                nums[i--] += carry;
                }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = { 9, 9, 9 };
        // int[] arr = { 1, 2, 3 };
        int[] arr = { 9 };
        lc66_PlusOne lc66 = new lc66_PlusOne();
        int[] ans = lc66.plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}
