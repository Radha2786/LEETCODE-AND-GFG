class Solution {
    public int lengthOfLIS(int[] nums) {
        return LIS(nums);
    }
     public static int LIS(int[] nums){
        // if greater simply add
        int[] lis = new int[nums.length];
        lis[0]=nums[0];
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>lis[len-1]){
                lis[len]=nums[i];
                len++;
            }else{
                int index = BinarySearch(lis,0, len-1, nums[i]);
                lis[index]=nums[i];
            }
        }
        return len;
    }
    public static int BinarySearch(int[] lis, int start, int end, int target){ 

        int index=0;

        while(start<=end){
            int mid = (start+end)/2;
            if(target<=lis[mid]){
                index=mid;
                end = mid-1;
            }else{
                start= mid+1;
            }
        }
        return index;  // target not found
    }
}