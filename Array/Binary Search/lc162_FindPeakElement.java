public class lc162_FindPeakElement {
    int peakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        lc162_FindPeakElement lc162 = new lc162_FindPeakElement();
        int ans = lc162.peakElement(arr);
        System.out.println(ans);
    }
}
