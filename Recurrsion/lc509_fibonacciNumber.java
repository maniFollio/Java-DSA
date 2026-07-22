public class lc509_fibonacciNumber {
    int fiboacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fiboacciNumber(n - 1) + fiboacciNumber(n - 2);
    }

    public static void main(String[] args) {
        int n = 2;
        lc509_fibonacciNumber lc509 = new lc509_fibonacciNumber();
        int res = lc509.fiboacciNumber(n);
        System.out.println(res);
    }
}
