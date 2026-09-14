import java.util.Arrays;

public class lc75_SortColors {
    public int[] sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return  nums;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 0, 2, 1, 1, 0 };
        lc75_SortColors lc75 = new lc75_SortColors();
        int ans[] = lc75.sortColors(arr);
        System.out.println(Arrays.toString(ans));
    }
}

/*
 * Leetcode will not accept this because of O(n) space complexity, it has to be
 * O(i).
 * int[] ans = new int[nums.length];
 * ArrayList<Integer> list = new ArrayList<>();
 * int idx = 0;
 * for (int i = 0; i < nums.length; i++) {
 * if (nums[i] == 0) {
 * ans[idx++] = 0;
 * }
 * }
 * for (int i = 0; i < nums.length; i++) {
 * if (nums[i] == 1) {
 * ans[idx++] = 1;
 * }
 * }
 * for (int i = 0; i < nums.length; i++) {
 * if (nums[i] == 2) {
 * ans[idx++] = 2;
 * }
 * }
 * // For leetcode we need to udate the change in the give array which is
 * nums[].
 * for (int i = 0; i < nums.length; i++) {
 * nums[i] = ans[i];
 * }
 */
