import java.util.Arrays;

public class lc01_twoSum_brt {
    // Printing with return statement----->
    public int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
        // int right = arr.length - 1;
        // int left = 0;
        // while (left < right) {
        // int sum = arr[left] + arr[right];
        // if (sum == target) {
        // return new int[] { left, right };
        // } else if (sum < target) {
        // left++;
        // } else {
        // right--;
        // }
        // }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4 };
        int sum = 6;
        lc01_twoSum_brt ts = new lc01_twoSum_brt();
        System.out.println(Arrays.toString(ts.twoSum(arr, sum)));
    }
}
// https://github.com/maniFollio/Java.git