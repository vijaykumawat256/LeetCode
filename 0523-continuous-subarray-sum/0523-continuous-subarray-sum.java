class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
      HashSet<Integer> set = new HashSet<>();
       int currSum=0, prevSum=0;
       
       for(int i : nums){
           currSum = (currSum+i)%k;
           if(set.contains(currSum)) return true;

           set.add(prevSum);
           prevSum = currSum;
       }

        return false;
    }
}