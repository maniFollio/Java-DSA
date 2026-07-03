import java.util.Arrays;

public class lc01_twoSum_brt {
    public int[] twoSum(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int sum = 9;
        lc01_twoSum_brt ts = new lc01_twoSum_brt();
        // ts.twoSum(arr, sum)-----> for Printing output without return statement.
        System.out.println(Arrays.toString(ts.twoSum(arr, sum)));
    }
}
