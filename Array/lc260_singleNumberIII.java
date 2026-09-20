public class lc260_singleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor = num ^ xor;
        }
        int mask = xor & -xor;
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                a = num ^ a;
            } else {
                b = num ^ b;
            }
        }
        return new int[] { a, b };
    }
}
