class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int MaxOnes = count;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                MaxOnes = Math.max(count,MaxOnes);
                count=0;
            }
        }
        MaxOnes = Math.max(count,MaxOnes);

        // System.out.println("count is " + count);
        // System.out.println("MaxOnes is " + MaxOnes);
        return MaxOnes;
    }
}