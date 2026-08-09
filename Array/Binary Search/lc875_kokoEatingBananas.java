public class lc875_kokoEatingBananas {
    int kokoEatingBanana(int[] nums, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for (int pile : nums) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        while (minSpeed < maxSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if(miniHour(nums, h, mid)){
                maxSpeed = mid;
            } else {
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }

    boolean miniHour(int piles[], int h, int speed) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + speed - 1) / speed;
        }
        return hours <= h;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        lc875_kokoEatingBananas lc875 = new lc875_kokoEatingBananas();
        int ans = lc875.kokoEatingBanana(arr, 8);
        System.out.println(ans);
    }
}
