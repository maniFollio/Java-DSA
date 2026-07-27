public class lc35_searchInsertPosition {
    int searchInsertrPosition(int[] nums, int val){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left+right) /2;

            if(nums[mid] == val){
                return mid;
            }

            if(val > nums[mid]){
                left = mid + 1; 
            } else {
                right = mid-1;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        // int k = 5;
        // int k = 2;
        int k = 7;
        lc35_searchInsertPosition lc35 = new lc35_searchInsertPosition();
        int res = lc35.searchInsertrPosition(arr, k);
        System.out.println(res);
    }
}
