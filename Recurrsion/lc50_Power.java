public class lc50_Power {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }
        return myPow(x, n - 1) * x;
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        lc50_Power lc50 = new lc50_Power();
        System.out.println(lc50.myPow(x, n));
    }
}
