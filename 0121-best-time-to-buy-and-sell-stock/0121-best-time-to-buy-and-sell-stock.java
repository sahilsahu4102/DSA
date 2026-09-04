import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            int nprofit=prices[i]-buy;
            if(nprofit>profit){
                profit=nprofit;
            }
            if(prices[i]<buy){
                buy=prices[i];
            }
        }
        return profit;
    }
}