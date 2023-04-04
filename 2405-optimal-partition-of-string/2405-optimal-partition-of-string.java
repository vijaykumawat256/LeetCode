class Solution {
    public int partitionString(String s) {
        
        int[] lastseen = new int[26];
        
        Arrays.fill(lastseen,-1);
        int count =1,start =0;
        
        for(int i=0;i<s.length();i++){
            if(lastseen[s.charAt(i)-'a']>=start){
                count++;
                start=i;
            }
            lastseen[s.charAt(i)-'a']=i;
        }
        return count;
    }
}