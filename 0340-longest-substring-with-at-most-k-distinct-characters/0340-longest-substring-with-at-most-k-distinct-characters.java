class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int result=0;
        int slow =0;
        int fast =0;
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(fast<s.length()){
            
            char c = s.charAt(fast);
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.size()>k){
                
                char d = s.charAt(slow);
                
                if(map.get(d)==1){
                    map.remove(d);
                }
                else{
                    map.put(d,map.get(d)-1);
                }
                slow++;
                
            }
            result = Math.max(result,fast-slow+1);
            fast++;
            
            
        }
        return result;
        
        
    }
}