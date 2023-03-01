class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int[] freqarra = new int[k];
       
        
        for(int i=0;i<nums.length;i++){
            if(i>0){
                nums[i] +=nums[i-1];
            }
            freqarra[(nums[i]%k + k)%k]++;
        }
        int res=freqarra[0];
        
        for(int freq:freqarra){
            res+=freq*(freq-1)/2;
        }
        return res;
        
    }
}