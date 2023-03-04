class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i=0;i<=num;++i){
            int diff = i;
            int newnum = 0;
            while(diff!=0){
                newnum = (diff%10)+ newnum*10; 
                diff = diff/10;
            }
            
            if(newnum+i==num){
                return true;
            }
        }
        return false;
        
    }
}