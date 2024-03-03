class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s1=sum(gas);
        int s2=sum(cost);
        if(s1<s2){
            return -1;
        }
        int remainingfuel=0, index=0;
        for(int i=0;i<gas.length ; i++){
            remainingfuel+=gas[i]-cost[i];
            if(remainingfuel<0){
                index=i+1;
                remainingfuel=0;
            }
        }
        return index;
    }
    public static int sum(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}