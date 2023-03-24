class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int n : nums1){
            set1.add(n);
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int m:nums2){
            set2.add(m);
        }
        
        set1.retainAll(set2);
        
        int[] output = new int[set1.size()];
        int id = 0;
        for(int s:set1){
            output[id++] =s;
        }
        return output;
        
    }
}