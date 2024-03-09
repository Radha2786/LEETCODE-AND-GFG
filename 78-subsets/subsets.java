class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ls = new ArrayList<>();
        Subsets(nums,list,ls,0);
        return ls;
    }
    public static void Subsets(int[] nums, List<Integer> list, List<List<Integer>> ls,int index){
       if(index==nums.length){
           ls.add(new ArrayList<>(list));
           return;
       }
       list.add(nums[index]);
       Subsets(nums,list,ls,index+1);
       list.remove(list.size()-1);
       Subsets(nums,list,ls,index+1);

    }
}