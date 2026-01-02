package Array.Medium;

public class besttimetobuysellstock {
    static void main(String[] args) {
        int[] arr = {1,1,23,5,1,5,5,4};
        System.out.println(maxProfit(arr));
    }
    static  public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - buy);
            }
        }
        return profit;
    }
}
