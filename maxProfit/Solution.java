public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length ==0){
            return 0;
        }    
        int lowest = prices[0];
        int result = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i] - lowest;
            if(prices[i]<lowest){
                lowest = prices[i];
            }
            if(profit>result)
                result = profit;
        }
        return result;
    }
}