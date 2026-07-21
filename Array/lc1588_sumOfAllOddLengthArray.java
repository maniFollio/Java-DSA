public class lc1588_sumOfAllOddLengthArray {
    void sumOfAllOddLengthSubarray(int[] nums) {
        int sum = 0;
        int l = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for(int j = i; j < l; j += 2){
                for(int k = i; k <= j; k++){
                    sum += nums[k];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        // int[] arr = {10, 11, 12};
        int[] arr = { 1, 4, 2, 5, 3 };
        lc1588_sumOfAllOddLengthArray lc1588 = new lc1588_sumOfAllOddLengthArray();
        lc1588.sumOfAllOddLengthSubarray(arr);
    }
}
