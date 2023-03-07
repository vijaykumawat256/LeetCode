class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        int n =9;
        int[][] rows = new int[n][n];
        int[][] cols = new int[n][n];
        int[][] boxes = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if(board[i][j]=='.'){
                   continue; 
                }
                
                int pos = board[i][j]-'1';
                
                if(rows[i][pos]==1){
                    return false;
                }
                rows[i][pos]=1;
                
                if(cols[j][pos]==1){
                    return false;
                }
                cols[j][pos]=1;
                
                int idx = (i/3)*3 + j/3;
                
                if(boxes[idx][pos]==1){
                    return false;
                }
                boxes[idx][pos]=1;
            }
        }
        return true;
        
    }
}