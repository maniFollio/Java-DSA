public class lc485_maxConsecutiveOnes {
    int maxOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 0, 1, 1, 0, 1 };
        // int[] arr = { 1, 1, 0, 1, 1, 1 };
        int[] arr = { 1 };
        lc485_maxConsecutiveOnes lc485 = new lc485_maxConsecutiveOnes();
        int res = lc485.maxOnes(arr);
        System.out.println(res);
    }
}
