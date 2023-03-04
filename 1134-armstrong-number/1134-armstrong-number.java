class Solution {
    public boolean isArmstrong(int n) {
        int digit =0;
        int sum = 0;
        int num = n;
        int cop = n;
        while(n!=0){
            n = n/10;
            digit++;
        }
    
        int d =digit;
        while(num>0){
         
            sum +=(int) Math.pow(num%10,d);
            num = num/10;
           
            
        }
        if(sum==cop){
            return true;
        }
        return false;
    }
}