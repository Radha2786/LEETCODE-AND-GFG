class Solution {
    public int longestOnes(int[] nums, int k) {
        int Zeroes = 0, length=0, MaxLength=0;
        int r=0,l=0;
        while(r<nums.length){
            if(nums[r]==0){
                Zeroes++;
            }
            while(Zeroes>k){
                if(nums[l]==0){
                    Zeroes--;
                }
                l++;
            }
            if(Zeroes<=k){
                length = r-l+1;
                MaxLength = Math.max(MaxLength, length);
            }
            r++;
        }
        return MaxLength;
    }
}