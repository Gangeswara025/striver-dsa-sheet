class Solution {
    public int maxProfit(int[] prices) {
        int price = prices[0];
        int result = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] < price) {
                price = prices[i];
            }
            else if(prices[i] - price > result) {
                result = prices[i] - price;
            }
        }
        return result;
    }
}