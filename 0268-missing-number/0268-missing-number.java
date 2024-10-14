class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int sum =0;
        for(int i=1;i<=n;i++){
            totalSum +=i;
        }
        for(int j=0;j<nums.length;j++){
            sum += nums[j];
        }
        return totalSum - sum;
    }
}