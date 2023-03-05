class Solution {
    public int superPow(int a, int[] b) {
        int ans=0;
     int x = 1;
        // For Making b a digit
        for(int i = 0; i < b.length ; i++){
             ans = (ans*10 + b[i])%1140;
              if(ans == 0){
                   ans += 1140;
              }
                x = x * 10;
        }
        
        a = a % 1337;
        long ans1 = 1;
        for(int i = 0; i < ans;i++){
            ans1=(ans1*a)%1337;
        }
        return (int)ans1;
      
        
        
        
    }
}