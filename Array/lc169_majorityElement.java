import java.util.Arrays;
public class lc169_majorityElement {
    void majorElement(int[] nums) {
        int n = nums.length;
        int temp = 0;
        int x = 1;
        int ans = -1;
        Arrays.sort(nums);

        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i-1]){
                x++;
            }
            else{
                x = 1;
            }

            if(x > temp){
                temp = x;
                ans = nums[i];
            }
        }
        System.out.println("Element "+ans + " Is Present " + temp + " Times");

        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if( nums[i] == nums[j]){
        //             count++;
        //         }
        //         if(count > temp){
        //         temp = count;
        //         x = nums[j];
        //     }
        //     }
        // }
        // System.out.println("Element "+x + " Is Present " + temp + " Times");
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        // int[] arr = { 2,2,1,1,1,2,2 };
        // int[] arr = { 2, 2, 1, 1, 1, 1, 1 };
        // int[] arr = { 2, 2, 1, 1, 1, 1, 3, 1, 5, 1 };
        lc169_majorityElement lc169 = new lc169_majorityElement();
        lc169.majorElement(arr);
    }
}
