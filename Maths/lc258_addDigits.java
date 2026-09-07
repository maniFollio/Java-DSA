public class lc258_addDigits {
    public int addDigits(int num) {
        int temp = 0;
        while (num >= 10) {
            while (num != 0) {
                temp += (num % 10);
                num = num / 10;
            }
            num = temp;
            temp = 0;
        }
        return num;
    }

    public static void main(String[] args) {
        lc258_addDigits lc258 = new lc258_addDigits();
        int n = 38;
        int ans = lc258.addDigits(n);
        System.out.println(ans);
    }
}
