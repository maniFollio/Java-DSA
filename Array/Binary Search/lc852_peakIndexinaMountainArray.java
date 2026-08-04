public class lc852_peakIndexinaMountainArray {
    int peakIndex(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] < nums[mid + 1]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,10,1};
        lc852_peakIndexinaMountainArray lc852 = new lc852_peakIndexinaMountainArray();
        int res = lc852.peakIndex(arr);
        System.out.println(res);
    }
}
