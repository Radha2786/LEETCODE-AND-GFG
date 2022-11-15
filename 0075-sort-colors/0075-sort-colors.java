class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length-1;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums)); 
        
    }
}