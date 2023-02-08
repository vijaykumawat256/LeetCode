class Solution {
    public boolean canJump(int[] nums) {
        
        int len = nums.length;
        
        
        if(len==1){
            
                return true;
            
            
        }
        int max=0;
        
        for(int i=0;i<len-1 && max>=i;i++){
            
            if(max < i + nums[i]){
                max = i + nums[i];
            }
            
            if(max>=len-1){
                return true;
            }
            
        }
        return false;
        
    }
}