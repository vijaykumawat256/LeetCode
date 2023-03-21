class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int[] arr = new int[map.size()];
        
        int even =0,odd=0;
        
        for(int i : map.values()){
            if(i%2==0){
                even += i;
            }
            else{
                even += i-1;
                odd=1;
            }
            
        }
        return even+odd;
    }
}