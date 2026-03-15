class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int val = target-numbers[i];
            if(map.containsKey(val)){
                return new int[]{map.get(val)+1,i+1};
            }else{
                map.put(numbers[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}