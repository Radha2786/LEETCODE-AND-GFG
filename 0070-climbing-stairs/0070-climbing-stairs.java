class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int ans= ClimbStairs(n,0,dp);
       return ans;
    }
     public static int ClimbStairs(int target, int i,int[] dp){
        if(i==target){
            return 1;
        }
        if(i>target){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        // choose 1
        int choose=ClimbStairs(target, i+1,dp);
        //choose 2
        int notchoose=ClimbStairs(target, i+2,dp);
        return dp[i]= choose+notchoose;
    }
}