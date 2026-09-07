public class lc367_validPerfectSquare {
    boolean perfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int left = 1;
        int right = num / 2;
        while ((left < right)) {
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if (sqr == num) {
                return true;
            } else if (sqr < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 16;
        lc367_validPerfectSquare lc367 = new lc367_validPerfectSquare();
        boolean bool = lc367.perfectSquare(num);
        System.out.println(bool);
    }
}
