class Solution {
    public List<String> removeAnagrams(String[] words) {
       
     
        
        String prev = "";
        List<String> li = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String s1 = words[i];
            char[] arr = s1.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!str.equals(prev)){
                li.add(words[i]);
                prev = str;
            }
        }
        return li;
        
    }
}