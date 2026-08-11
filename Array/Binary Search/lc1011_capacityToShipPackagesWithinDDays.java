public class lc1011_capacityToShipPackagesWithinDDays {
    int capacityTOShip(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isCapacityEnough(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    boolean isCapacityEnough(int[] weights, int days, int capacity) {
        int currentWeight = 0;
        int day = 1;
        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                day++;
                currentWeight = weight;
            } else {
                currentWeight += weight;
            }
        }
        return day <= days;
    }

    public static void main(String[] args) {
        lc1011_capacityToShipPackagesWithinDDays lc1011 = new lc1011_capacityToShipPackagesWithinDDays();
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // int days = 5;
        int[] arr = { 3,2,2,4,1,4};
        int days = 3;
        int res = lc1011.capacityTOShip(arr, days);
        System.out.println(res);
    }

}
