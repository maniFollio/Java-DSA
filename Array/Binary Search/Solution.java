public class Solution {
    public int mySqrt(int x) {
        if (x <= 0) {
            return 0;
        }
        int prev = 0;
        for (int i = 1; i <= x / 2; i++) {
            if (i * i == x) {
                return i;
            } else if (i * i > x) {
                return prev;
            }
            prev = i;
        }
        return 1;
    }
} {
    
}
