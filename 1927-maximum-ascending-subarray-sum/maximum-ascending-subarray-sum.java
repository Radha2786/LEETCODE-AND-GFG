class Solution {
    public static int maxAscendingSum(int[] nums) {
        int sum =nums[0];
        int MaxSum=sum;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                sum=nums[i];
                continue;
            }
            sum+=nums[i];
            MaxSum = Math.max(sum, MaxSum);

        }
        return MaxSum;
    }
}