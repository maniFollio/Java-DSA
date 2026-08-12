class lc69_Sqrt {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int prev = 0;
        int left = 1;
        int right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                prev = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return prev;
    }

    public static void main(String[] args) {
        int n = 0;
        lc69_Sqrt lc69 = new lc69_Sqrt();
        int res = lc69.mySqrt(n);
        System.out.println(res);
    }
}