class Solution {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        float sum = 0;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]){
                min = salary[i];
            }
            if(max<salary[i]){
                max=salary[i];
            }
            sum += salary[i];
        }
        double avg  = (double)(sum-min-max)/(salary.length-2);
        return avg;
    }
}