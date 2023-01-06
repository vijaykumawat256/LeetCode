class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        if(costs[0]>coins){
            return 0;
        }
        if(costs[0]==coins){
            return 1;
        }
        
        for(int i=0;i<costs.length;i++){
            
            if(coins!=0){
                if(coins>=costs[i]){
                    coins=coins-costs[i];
                    count++;
                    
                }
                
            }

        }
        return count;
        
    }
}