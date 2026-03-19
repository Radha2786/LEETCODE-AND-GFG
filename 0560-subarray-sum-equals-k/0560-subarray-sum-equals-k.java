class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int prefixsum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixsum+=nums[i];
            int x = prefixsum-k;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);         
        }
        return count;
    }
}