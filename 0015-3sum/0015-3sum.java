class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> ls = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third = -(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    Collections.sort(temp);
                    ans.add(temp);
                }
                set.add(nums[j]);
            }
        }
        for(List<Integer> list:ans){
            ls.add(list);
        }
        return ls;

    }
}