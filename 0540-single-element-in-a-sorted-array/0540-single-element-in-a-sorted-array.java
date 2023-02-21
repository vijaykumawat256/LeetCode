class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            // int count=1;
            // if(nums[i]==nums[i+1]){
            //     count= 2;
            //     i++;
            // }
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
            
           
        }
        
        for (int a : nums) {

			if (map.get(a) == 1)
				return a;
		}
        return -1;
        
    }
}