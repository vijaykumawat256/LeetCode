class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        String word1 = strs[0];
        for(int i = 0; i<word1.length();i++){ 
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)<strs[j-1].charAt(i)){
                    count=count+1;
                    break;
                }
                
               
                
            }
        }
       
        return count;
        
    }
}