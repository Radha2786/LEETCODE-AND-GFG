class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<Integer> list = new ArrayList<>();
        List<List<Integer>> ls = new ArrayList<>();
        Subset(list,ls,nums,0);
        return ls;
    }
    public static void Subset(List<Integer> list, List<List<Integer>> ls,int[] nums,int index){
        ls.add(new ArrayList<>(list));
        for(int i=index ; i< nums.length ; i++){
            if(i==index || nums[i]!=nums[i-1]){
                list.add(nums[i]);
                Subset(list,ls,nums,i+1);
                list.remove(list.size()-1);
            }else{
                continue;
            }
        }
    
    }
} 