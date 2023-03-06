class Solution {
    public int diagonalSum(int[][] mat) {
        int dsum = 0;
        int minu=0;
        int n = mat.length;
        for(int i=0;i<mat.length;i++){
            
            dsum += mat[i][i];
            minu += mat[i][n-i-1];
       
        }
        if(n%2!=0){
            dsum -= mat[n/2][n/2];
        }
        return dsum+minu;
        
        
    }
}