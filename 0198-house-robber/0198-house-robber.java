class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        
        for(int i=1;i<len;i++){
            int take = nums[i];
            if(i>1){
                take+=prev2;
                
            }
            int noTake = prev;
            int curr = Math.max(take,noTake);
            prev2=prev;
            prev=curr;
            
        }
        return prev;
    }
}