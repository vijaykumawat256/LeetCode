class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long ans =0, numSubArray = 0;
        
        for(int num:nums){
            if(num==0){
                numSubArray++;
            }
            else
                numSubArray=0;
            
            ans += numSubArray;
        }
        return ans;
    }
}