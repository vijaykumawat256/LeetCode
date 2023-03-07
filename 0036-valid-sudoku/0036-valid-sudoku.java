class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        
        HashSet<Character>[] rows = new HashSet[n];
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];
        
        
        for(int r=0;r<n;r++){
            rows[r] = new HashSet<>();
            cols[r] = new HashSet<>();
            boxes[r]= new HashSet<>();
        }
        
        for(int r = 0;r<n;r++){
            for(int c=0;c<n;c++){
                
                char val = board[r][c];
                
                if(val=='.'){
                    continue;
                }
                
                if(rows[r].contains(val)){
                    return false;
                }
                rows[r].add(val);
                
                if(cols[c].contains(val)){
                    return false;
                }
                cols[c].add(val);
                
                int idx = (r/3)*3 + c/3;
                
                if(boxes[idx].contains(val)){
                    return false;
                }
                boxes[idx].add(val);
            }
        }
        return true;
    }
}