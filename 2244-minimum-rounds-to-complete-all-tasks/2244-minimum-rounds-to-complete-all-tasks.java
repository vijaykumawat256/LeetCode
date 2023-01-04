class Solution {
    public int minimumRounds(int[] tasks) {

        Map<Integer,Integer> m = new HashMap<>();
        for(int task:tasks){
        
            m.put(task,m.getOrDefault(task,0)+1);
        }

        int rounds = 0;
        for(int value:m.values()){
  
            if(value==1)
                return -1;

            rounds+=(value/3);
            if(value%3>0)
            rounds++;
        }
        return rounds;
    }
}