public class lc507_perfectNumber {
    public void checkPerfectNumber(int num) {
        int total = 0;
        int n = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        System.out.println(total);
        // return total % num == 0;
    }
    public static void main(String[] args) {
        int n = 28;
        lc507_perfectNumber lc508 = new lc507_perfectNumber();
        lc508.checkPerfectNumber(n);
    }

}
