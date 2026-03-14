class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] result = new int[k];
        int i=0;
        for(Map.Entry<Integer, Integer> entry:list){
            if(i<k){
            result[i]= entry.getKey();
            }else{
                break;
            }
            i++;
        }

        return result;
    }
}