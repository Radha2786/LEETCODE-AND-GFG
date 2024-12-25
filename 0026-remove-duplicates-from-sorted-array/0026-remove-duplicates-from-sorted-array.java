class Solution {
    public int removeDuplicates(int[] nums) {
        int p1=0, p2=1, k=1;
        while(p2<nums.length){
            if(nums[p1]!=nums[p2]){
                p1++;
                Swap(p1,p2,nums);
                k++;
            }
            p2++;
        }
        return k;

    }

    public static void Swap(int p1, int p2,int[] nums){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}