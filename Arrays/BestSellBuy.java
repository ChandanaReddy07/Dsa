class Solution {
    public int maxProfit(int[] prices) {
        
        int l=prices[0],profit=0;
        for (int i=1;i<prices.length;i++){
            if(prices[i]<l){
                l=prices[i];
            }
            else {
                int sub=prices[i]-l;
                if(profit<sub)
                    profit=sub;
            }
        }
        return profit;
    
        
    }
}