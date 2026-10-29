public class lc1304_FindNUniqueIntegersSumuptoZero {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int val = 1;
        int idx = 0;
        if (n % 2 != 0) {
            arr[idx++] = 0;
        }
        while (idx + 1 < n) {
            arr[idx++] = -val;
            arr[idx++] = val;
            val++;
        }
        return arr;
    }
}
