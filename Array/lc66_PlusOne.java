import java.util.Arrays;

public class lc66_PlusOne {
    int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] == 9){
                nums[i] = 0;
            } else {
                nums[i] += 1;
                return nums;
            }
        }
        nums = new int[nums.length + 1];
        nums[0] = 1;
        return nums;
    }

    public static void main(String[] args) {
        // int[] arr = { 9, 9, 9 };
        // int[] arr = { 1, 2, 9 };
        // int[] arr = { 1, 2, 3 };
        int[] arr = { 9 };
        lc66_PlusOne lc66 = new lc66_PlusOne();
        int[] ans = lc66.plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}
