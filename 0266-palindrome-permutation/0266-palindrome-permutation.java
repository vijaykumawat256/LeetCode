class Solution {
    public boolean canPermutePalindrome(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        for (Character key : map.keySet()) {
    Integer c = map.get(key);
            if(c%2==0){
                continue;
            }
            if(c%2!=2){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}