class Solution {
    
    boolean overlap(int[] a, int[] b){
        return Math.min(a[1],b[1]) - Math.max(a[0],b[0]) >=0;
    }
    
    int[] mergerInterval(int[] a, int[] b){
        int[] newInterval = {Math.min(a[0],b[0]),Math.max(a[1],b[1])};
        return newInterval;
        
    }
    
    public int[][] merge(int[][] intervals) {
        
        //System.out.println(Arrays.toString(intervals[0]));
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //System.out.println(Arrays.toString(intervals[0]));
        
        List<int[]> newArr = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int[] currInterval = {intervals[i][0],intervals[i][1]};
            while(i<intervals.length && overlap(currInterval,intervals[i])){
                currInterval = mergerInterval(currInterval,intervals[i]);
                i++;
            }
            i--;
            newArr.add(currInterval);
        }
        return newArr.toArray(new int[newArr.size()][2]);
        
        
    }
}