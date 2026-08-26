public class lc263_uglyNumber {
    boolean uglyNumber(int n) {
    if (n <= 0) {
        return false;
    }
    while (n % 2 == 0) {
        n /= 2;
    }
    while (n % 3 == 0) {
        n /= 3;
    }
    while (n % 5 == 0) {
        n /= 5;
    }
    return n == 1;
}

    public static void main(String[] args) {
        int n = 4;
        lc263_uglyNumber lc263 = new lc263_uglyNumber();
        boolean res = lc263.uglyNumber(n);
        System.out.println(res);
    }
}
