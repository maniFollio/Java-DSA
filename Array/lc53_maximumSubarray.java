// import java.util.*;
public class lc53_maximumSubarray {
    public int maxArr(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        // Optimized Methood Using Kadane's Algorithm.
        int currSum = 0;
        for(int i = 0; i<n;i++){
        currSum += arr[i];
        maxSum = Math.max(currSum, maxSum);
        if(currSum < 0){
        currSum = 0;
        }
        }
        return maxSum;}
        // Optimized Brute Force Algorithm for finding Max sub-Array Sum.
        // for (int st = 0; st < n; st++) {
        // int sum = 0;
        // for (int end = st; end < n; end++) {
        // sum = arr[end] + sum;
        // if (maxSum < sum) {
        // maxSum = sum;
        // }
        // }
        // }
        // System.out.println("Maximum Sum Of Sub-Array = " + maxSum);
        // }


        // Brute Force Algorithm for finding Max sub-Array Sum.
        // for (int st = 0; st < n; st++) {
        //     for (int end = st; end < n; end++) {
        //         int sum = 0;
        //         for (int i = st; i <= end; i++) {
        //             System.out.print(arr[i] + " ");
        //             sum = arr[i] + sum;
        //             maxSum = Math.max(sum, maxSum);
        //         }
        //         System.out.print("= " + sum + ',');
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("Maximum Sum Of Sub-Array = " + maxSum);
    // }

    public static void main(String[] args) {
        // int[] arr = {2,1,-3,4,-1,2,1,-5,4};
        int[] arr = { 1, 2, 3, 4, 5};
        lc53_maximumSubarray lc53 = new lc53_maximumSubarray();
        // lc53.maxArr(arr);
        int res = lc53.maxArr(arr);
        System.out.println("Maximum Sum Of Sub-Array = " + res);

    }
}
