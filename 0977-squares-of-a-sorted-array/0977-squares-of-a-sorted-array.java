class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1=0, p2=0;
        int[] result = new int[nums.length];
        
        while(p2<nums.length && nums[p2]<0){
            p2++;
        }

        p1=p2-1;

        // System.out.println(nums[p1]);
        // System.out.println(nums[p2]);
        int i=0;
        while(p1>=0 && p2<nums.length){
            if(nums[p1]*nums[p1]<nums[p2]*nums[p2]){
                result[i]= nums[p1] * nums[p1];
                p1--;
            }else{
                result[i]= nums[p2] * nums[p2];
                p2++;
            }
            i++;
        }

        while(p1>=0){
            result[i]= nums[p1] * nums[p1];
            p1--;
            i++;
        }

        while(p2<nums.length){
            result[i]= nums[p2] * nums[p2];
            p2++;
            i++;
        }
        return result;
    }
}