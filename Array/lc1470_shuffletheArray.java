import java.util.Arrays;

public class lc1470_shuffletheArray {
    int[] shuffleTheArray(int[] nums, int n) { // n is the half size of the array.
        int[] og = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            og[idx] = nums[i];
            idx += 2;
        }
        idx = 1;
        for (int i = n; i < nums.length; i++) {
            og[idx] = nums[i];
            idx += 2;
        }
        return og;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 4, 3, 2, 1 };
        // int[] arr = { 1, 1, 2, 2 };
        int[] arr = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        lc1470_shuffletheArray lc1470 = new lc1470_shuffletheArray();
        int[] res = lc1470.shuffleTheArray(arr,n);
        System.out.println(Arrays.toString(res));
    }
}
