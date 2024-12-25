class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        Reverse(nums,0,nums.length-1); // reverse the whole array first
        Reverse(nums,0,k-1);
        Reverse(nums,k,nums.length-1);
        
    }

    public static void Reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}