class Solution {
    
    private int lowerbound(int[] arr,int key){
        int lo =0;
        int hi = arr.length;
        
        while(lo<hi){
            int mid = lo + (hi-lo)/2;
            
            if(arr[mid]<key){
                lo = mid +1;
            }
            else{
                hi = mid;
            }
        }
        return lo;
    }
        
        
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        int[] ans = new int[spells.length];
        
        int m = potions.length;
        
        int maxPotion = potions[m-1];
        
        for(int i =0;i<spells.length;i++){
            int spell = spells[i];
            
            long minPotion = (long) Math.ceil((1.0 * success)/spell);
            
            if(minPotion>maxPotion){
                ans[i]=0;
                continue;
            }
            
            int index = lowerbound(potions,(int) minPotion);
            ans[i] = m-index;
        }
        
        return ans;
        
        
    }
}