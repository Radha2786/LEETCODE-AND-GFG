class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] result = new int[n/3][3];
        int index=0;
        for(int i=0;i<=n-3 ; i=i+3){
            if(nums[i+2]-nums[i]>k){
                return new int[0][0];
            }else{
                int[] ans = {nums[i],nums[i+1],nums[i+2]};
                result[index++]=ans;
                
            }
        }
        return result;

    }
}