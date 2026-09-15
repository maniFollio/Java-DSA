public class lc342_powerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num == 1) {
            return true;
        }
        if (num < 1 || num % 4 != 0) {
            return false;
        }
        return isPowerOfFour(num / 4);
    }
}
