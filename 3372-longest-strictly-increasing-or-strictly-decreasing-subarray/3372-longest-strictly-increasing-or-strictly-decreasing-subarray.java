class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int increasing = 1;
        int decreasing = 1;
        int maxincreasing = 0;
        int maxdecreasing = 0;
        for(int i=0;i<nums.length-1;i++){
          if(nums[i]>nums[i+1]){
              increasing++;
              decreasing=1;
              
          }else if(nums[i]<nums[i+1]){
              decreasing++;
              increasing=1;
          }else{
                decreasing=1;
                increasing=1;
            }
            if(decreasing > maxdecreasing){
                maxdecreasing = decreasing; 
            }
             if(increasing > maxincreasing){
                maxincreasing = increasing; 
            }
            
        }
        return Math.max(maxdecreasing,maxincreasing);
    }
}