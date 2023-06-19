class Solution {
    public int largestAltitude(int[] gain) {
        
        int curr =0;
        int high = curr;
        
        for(int v :gain){
            curr += v;
            high = Math.max(high,curr);
        }
        
        return high;
    }
}