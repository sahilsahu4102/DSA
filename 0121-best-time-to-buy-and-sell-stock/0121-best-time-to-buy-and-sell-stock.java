class Solution {
    public int maxProfit(int[] prices) {
        int best=0;
        int buy=prices[0];
        for(int i=0;i<prices.length;i++){
            int n=prices[i]-buy;
            best=Math.max(best,n);
            if(prices[i]<buy){
                buy=prices[i];
            }
        }
        return best;
    }
}