class Solution {
    public boolean isAnagram(String s, String t) {
        
        int n = s.length();
        int tn = t.length();
        if(n!=tn){
            return false;
        }
        
    
        HashMap<Character,Integer> map1 = new HashMap<>();
      
        
        for(int i =0; i<n;i++){
            char c1 = s.charAt(i);

            if(map1.containsKey(c1)){
                map1.put(c1,map1.get(c1) +1);
            }
            else
                map1.put(c1,1);
        }
        
        for(int i =0; i<n;i++){
            char c2 = t.charAt(i);
            if(map1.containsKey(c2)){
                map1.put(c2,map1.get(c2) -1);
            }
            else{
                return false;
            }
        }
        
        for (int num : map1.values()) {
            if (num != 0) {
                return false;
            }
        }
        return true;
        
        
        
    }
}