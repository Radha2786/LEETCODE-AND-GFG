class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        Integer[][] dp =  new Integer[nums1.length][nums2.length];
        return Solve(nums1, nums2, 0, 0, dp);

    }
    public static int Solve(int[] nums1, int[] nums2, int i, int j, Integer[][] dp){
        if(i==nums1.length || j== nums2.length){
            return -1_000_000_000;
        }

        if (dp[i][j] != null) return dp[i][j];

        int val = nums1[i]*nums2[j];
        int take_i_j = (nums1[i]*nums2[j]) + Solve(nums1, nums2, i+1, j+1, dp);
        int take_i = Solve(nums1, nums2, i, j+1, dp);
        int take_j = Solve(nums1, nums2, i+1, j, dp);
        return dp[i][j]= Math.max(val,Math.max(take_i_j,Math.max(take_i,take_j)));

    }
}