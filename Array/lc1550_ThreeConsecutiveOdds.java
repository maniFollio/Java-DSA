public class lc1550_ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if(count == 3){
                    return true;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(count);
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
        lc1550_ThreeConsecutiveOdds lc1550 = new lc1550_ThreeConsecutiveOdds();
        System.out.println(lc1550.threeConsecutiveOdds(nums));
    }
}
