class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int len1=word1.length();
        int len2=word2.length();
        int i =0;
        String str = "";
        while(i<len1|| i<len2){
            if(i<len1){
                str += word1.charAt(i);
            }
            if(i<len2){
                str += word2.charAt(i);
            }
           
            i++;
   
        }
       
        return str;
    }
}