import java.util.Arrays;

public class lc1365_howManyNumbersAreSmallerThantheCurrentNumber {
    int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        lc1365_howManyNumbersAreSmallerThantheCurrentNumber lc1365 = new lc1365_howManyNumbersAreSmallerThantheCurrentNumber();
        int[] res = lc1365.smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(res));
    }
}
