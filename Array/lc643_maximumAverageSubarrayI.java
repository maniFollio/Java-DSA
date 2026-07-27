public class lc643_maximumAverageSubarrayI {
    double maximumAverage(int[] nums, int k) {
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int idx = 0;
        int maxSum = sum;
        for (int j = k; j < nums.length; j++) {
            sum += nums[j];
            sum -= nums[idx++];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        lc643_maximumAverageSubarrayI lc643 = new lc643_maximumAverageSubarrayI();
        double res = lc643.maximumAverage(arr, k);
        System.out.println(res);
    }
}



// Brutr force
// double maxSum = 0;
// for(int i = 0; i <= nums.length - k; i++){
// double sum = 0;
// for(int j = i; j < k+i; j++){
// sum += nums[j];
// }
// maxSum = Math.max(sum, maxSum);
// }
// System.out.println(maxSum);
// double avg = maxSum / k;
// return avg;
