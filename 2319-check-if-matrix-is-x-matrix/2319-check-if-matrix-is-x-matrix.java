class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        
        for(int i=0;i<n;i++){
            int a = grid[i][i];
            int b = grid[i][n-i-1];
            if(a==0 || b==0){
                return false;
            }
            for(int j=0;j<n;j++){
                
                if(j==i|| j ==Math.abs(n-i-1)){
                    continue;
                }
                
                else if(grid[i][j]!=0){
                    return false;
                }
            }
        }
        
      
        
        
        
        return true;
    }
}