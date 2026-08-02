public class lc374_guessNumberHigherorLower {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // int result = guess(mid); --> guess() method is inbuilt in leetcode.
            if (result == 0) {
                return mid;
            } else if (result == -1) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
