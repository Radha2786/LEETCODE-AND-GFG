class Solution {
    public int numSubseq(int[] nums, int target) {
        int MOD = 1000000007;
        Arrays.sort(nums);
        int l =0, r = nums.length-1;
        int[] TwoKiPower = new int[nums.length];
        TwoKiPower[0] = 1;
        int totalsequence =0 ;
        
        for(int i=1;i<nums.length;i++){
            TwoKiPower[i] = (TwoKiPower[i-1]*2)%MOD;
        }
        while(l<=r){
            if(nums[l]+nums[r]>target){
                r--;
            }else{
                // calculate power 
                // 2^(r-l) kyuki phla to included hi hoga bcz subsequence can't be empty
                totalsequence = (totalsequence + TwoKiPower[r - l]) % MOD;
                l++; // for futher subsequences
            }
        }
        return totalsequence;
    }
}