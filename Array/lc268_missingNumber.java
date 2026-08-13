import java.util.Arrays;

public class lc268_missingNumber {
    int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != counter){
                return counter;
            }
            counter++;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        // int[] arr = { 3, 0, 1 };
        // int[] arr = { 0, 1 };
        lc268_missingNumber lc268 = new lc268_missingNumber();
        int res = lc268.missingNumber(arr);
        System.out.println(res);
    }
}
