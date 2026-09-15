public class lc204_countPrimes {
    // Not supported in LeetCode.
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int primeCount = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
