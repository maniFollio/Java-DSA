public class lc121_bestTimeToBuyAndSellStock {
    public int buySell(int[] prices) {
        int profit = 0;
        int n = prices.length - 1;
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(low > prices[i]){
                low = prices[i];
            }
                profit = Math.max( profit, (prices[i] - low));
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1 };
        // int arr[] = { 7, 6, 4, 3, 1 };
        // int arr[] = { 7,1,5,3,6,4 };

        /*
         * Test Cases
         * [7,1,5,3,6,4]
         * [7,6,4,3,1]
         * [5,10,1,4]
         * [1]
         * [2,4,1]
         */
        lc121_bestTimeToBuyAndSellStock lc121 = new lc121_bestTimeToBuyAndSellStock();
        int res = lc121.buySell(arr);
        System.out.println(res);
    }
}

// I tried At First Attempt.
/*
 * int buy = Integer.MAX_VALUE;
 * int sell = Integer.MIN_VALUE;
 * int profit = 0;
 * 
 * if(prices.length == 1) return 0;
 * for (int i = 0; i < prices.length; i++) {
 * if (buy > prices[i]) {
 * buy = prices[i];
 * if(buy == (prices.length-1)) return 0;
 * }
 * for (int j = i + 1; j < prices.length; j++) {
 * if (sell < prices[j]) {
 * sell = prices[j];
 * }
 * }
 * }
 * profit = sell - buy;
 * return profit;
 * // System.out.println(buy);
 * // System.out.println(sell);
 * // System.out.println(profit);
 * int n = prices.length;
 */
