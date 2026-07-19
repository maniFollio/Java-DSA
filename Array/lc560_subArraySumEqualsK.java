public class lc560_subArraySumEqualsK {
    void subArraySum(int[] nums, int k) {
        int count = 0;
        for(int i =0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 1, 1 };
        // int k = 2;
        int[] arr = { 1, 2, 3 };
        int k = 3;
        lc560_subArraySumEqualsK lc560 = new lc560_subArraySumEqualsK();
        lc560.subArraySum(arr, k);
    }
}
