class Solution {
    public int rob(int[] nums) {
       if(nums.length==1){
           return nums[0];
          
       }
        int max1= selectOrder(nums, 0, nums.length-2);
        int max2 = selectOrder(nums,1,nums.length-1);
        
        return Math.max(max1,max2);
    }
    public int selectOrder(int[] nums, int start,int end){
        
        int len = nums.length;
        int prev = 0;
        int prev2 = 0;
        
        for(int i=start;i<=end;i++){
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