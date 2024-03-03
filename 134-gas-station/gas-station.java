class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int totalleft=0;
        int remainingfuel=0, index=0;
        for(int i=0;i<gas.length ; i++){
            remainingfuel+=gas[i]-cost[i];
            if(remainingfuel<0){
                index=i+1;
                remainingfuel=0;
            }
            totalleft+=gas[i]-cost[i];
        }
        return totalleft<0?-1:index;
    }
  
}