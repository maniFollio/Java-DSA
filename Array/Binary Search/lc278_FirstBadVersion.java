public class lc278_FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    boolean isBadVersion(int mid){
        // Dummy Function as it is inbuilt function in leetcode.
        return true;
    }
}
