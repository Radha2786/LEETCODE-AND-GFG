class Solution {
    public int lengthOfLIS(int[] nums) {
        // Binary Search optimal approach (only do while calculating length) 
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i=1;i<nums.length ; i++){
            if(nums[i]>list.get(list.size()-1)){
                list.add(nums[i]);
            }else{
                int position = BinarySearch(list,nums[i]);
                list.set(position,nums[i]);
            }
        }
        return list.size();
    }
  public static int BinarySearch(List<Integer> list, int element){
        int s=0;
        int e=list.size()-1;
        int ans =0;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(list.get(mid)>=element){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }
}