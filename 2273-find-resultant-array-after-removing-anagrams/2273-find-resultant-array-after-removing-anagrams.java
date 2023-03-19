class Solution {
    public List<String> removeAnagrams(String[] words) {
       
        String prev ="";
        List<String> li=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            
            String s1 = words[i];
       
            
            char[] arr1 = s1.toCharArray();
               
            Arrays.sort(arr1);
            
            String str1 =  String.valueOf(arr1);
            if(!str1.equals(prev)){
                li.add(words[i]);
                prev = str1;
                
            }
            
            
        }
        return li;

        
        
    }
}