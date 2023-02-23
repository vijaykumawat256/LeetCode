class Solution {
    public double myPow(double x, int n) {
        long N =n;
        if(N<0){
            x=1/x;
            N=-N;
        }
        double ans =1;
        double currP =x;
        for(long i =N;i>0;i=i/2){
            if((i%2==1)){
                ans =ans*currP;
            }
            currP = currP*currP;
            
        }
        return ans;
        
    }
}