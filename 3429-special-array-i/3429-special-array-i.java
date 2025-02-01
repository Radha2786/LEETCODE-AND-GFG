class Solution {
    public boolean isArraySpecial(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int i=0;
        while(i<nums.length-1){
            if(nums[i]%2==0 && nums[i+1]%2 ==0 || nums[i]%2!=0 && nums[i+1]%2 !=0){
                return false;
            }
            i++;
        }
        return true;
    }
}