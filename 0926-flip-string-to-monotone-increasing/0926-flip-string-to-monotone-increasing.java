class Solution {
    public int minFlipsMonoIncr(String s) {
        int len = s.length();
        int count=0;
        
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='0'){
                count++;
            }
            
        }
        int ans = count;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='0'){
                ans = Math.min(ans,--count);
                
            }
            else{
                count++;
            }
        }
        return ans;
    }
}