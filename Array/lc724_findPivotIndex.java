public class lc724_findPivotIndex {
    void pivoteIndex(int[] nums){
        int left = 1;
        int right = nums.length-1;
        int leftSum = 0;
        int rightSum = 0;
        while(left < right){
            leftSum += nums[left-1];
            rightSum += nums[left+1];
            
            
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 7, 5, 6, 6, 5 };

    }

}
