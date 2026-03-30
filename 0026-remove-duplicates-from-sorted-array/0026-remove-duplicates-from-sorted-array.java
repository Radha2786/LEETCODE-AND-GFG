class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0;
        int p2=p1+1;
        int count=1;
        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                count++;
                p1++;
                nums[p1]=nums[p2];
            }else{
                p2++;
            }
        }
        return count;
    }
}