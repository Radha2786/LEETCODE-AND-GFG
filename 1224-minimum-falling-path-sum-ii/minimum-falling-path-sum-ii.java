class Solution {
    public int minFallingPathSum(int[][] grid) {
         int[][] dp = new int[grid.length][grid[0].length];
        for(int[] arr:dp){
            Arrays.fill(arr,-200);
        }
        int ans = Integer.MAX_VALUE;
        for(int col=0;col<grid[0].length;col++){
           ans= Math.min(MinFallPathSum2(grid, dp,0, col),ans);
        }
        return ans;
    }
     public static int MinFallPathSum2(int[][] grid, int[][] dp, int row, int col){
        if(row==grid.length-1){
            return grid[row][col];
        }
        if(dp[row][col]!=-200){
            return dp[row][col];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            if(col!=i){
               ans= Math.min(ans,MinFallPathSum2(grid, dp, row+1, i));
            }
        }
        return dp[row][col]= grid[row][col]+ans;
    }
}