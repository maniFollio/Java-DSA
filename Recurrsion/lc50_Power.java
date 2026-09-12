public class lc50_Power {
    public double myPow(double x, int n) {
        long power = n;
        if (n < 0) {
            x = 1 / x;
            power = -power;
        }
        if (power== 0) {
            return 1.0;
        }
        if (power% 2 == 0) {
            return myPow(x * x, (int)(power/ 2));
        } else {
            return myPow(x * x, (int)(power/ 2)) * x;
        }
    }

    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;
        lc50_Power lc50 = new lc50_Power();
        System.out.println(lc50.myPow(x, n));
    }
}
