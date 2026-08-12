import java.util.Arrays;

public class lc1470_shuffletheArray {
    int[] shuffleTheArray(int[] nums, int n) {
        int[] og = new int[nums.length];
        int len = (nums.length / 2); // n can also be used inplace of len.
        int idx = 0;
        for (int i = 0; i < len; i++) {
            og[idx] = nums[i];
            idx += 2;
        }
        idx = 1;
        for (int i = len; i < nums.length; i++) {
            og[idx] = nums[i];
            idx += 2;
        }
        return og;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 4, 3, 2, 1 };
        // int[] arr = { 1, 1, 2, 2 };
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        lc1470_shuffletheArray lc1470 = new lc1470_shuffletheArray();
        int[] res = lc1470.shuffleTheArray(arr, 4);
        System.out.println(Arrays.toString(res));
    }
}
