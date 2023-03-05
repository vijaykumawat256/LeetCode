class Solution {
    public int superPow(long a, int[] b) {
        int ans = 0;
        int x = 1;
        // For Making b a digit
        for(int i = 0; i < b.length ; i++){
             ans = (ans*10 + b[i])%1140;
              if(ans == 0){
                   ans += 1140;
              }
                x = x * 10;
        }
       // finding power of a
        a = a % 1337;
        long ans1 = 1;
        for(int i = 0; i < ans;i++){
            ans1=(ans1*a)%1337;
            System.out.println(ans1);
        }
        int ans2 = (int)ans1;
        return ans2;
    }
}