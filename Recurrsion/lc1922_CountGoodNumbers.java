public class lc1922_CountGoodNumbers {
    // Not LeetCode Friendly.
    public int countGoodNumbers(int idx, long n) {
        if (n == idx) {
            return 1;
        }
        if (idx % 2 == 0) {
            return countGoodNumbers(idx + 1, n) * 5;
        } else {
            return countGoodNumbers(idx + 1, n) * 4;
        }
    }

    public static void main(String[] args) {
        long n = 3;
        lc1922_CountGoodNumbers lc1922 = new lc1922_CountGoodNumbers();
        int res = lc1922.countGoodNumbers(0, n);
        System.out.println(res);
    }
}
