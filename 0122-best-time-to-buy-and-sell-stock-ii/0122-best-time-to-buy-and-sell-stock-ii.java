class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        
        for(int i =0; i<prices.length-1;i++){
            
            int buy = prices[i];
            int sell = prices[i+1];
            if(sell>buy){
                max= max+sell-buy;
            }
            
        }
        return max;
        
    }
}