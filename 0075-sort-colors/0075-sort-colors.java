class Solution {
    // Dutch National flag Algorithm (Striver-- intution)
    public void sortColors(int[] nums) {
        int low = 0 , mid = 0 ;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                // swap arr[0] and arr[mid] and increase both
                int temp = nums[mid];
                nums[mid]=nums[low];
                nums[low]= temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                // swap arr[mid] and arr[high]
                int temp = nums[mid];
                nums[mid]=nums[high];
                nums[high]= temp;
                high--;
            }
        } 
    }
}