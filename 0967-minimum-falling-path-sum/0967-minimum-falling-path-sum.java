class Solution {
    public int minFallingPathSum(int[][] matrix) {
       int max = Integer.MAX_VALUE;
       int[][] dp = new int[matrix.length][matrix[0].length];
       for(int[] arr: dp){
           Arrays.fill(arr,200);
       }
       for(int i=0;i<matrix[0].length;i++){
           int ans=MinimumFallingPath(matrix,i,0,dp);
           max=Math.min(ans,max);
       }
       return max; 
    }
    public static int MinimumFallingPath(int[][] matrix,int col,int row,int[][] dp){
        int n = matrix.length;
        int m = matrix[0].length;

        if(row>=n || col>=m || row<0 || col<0){
            return Integer.MAX_VALUE;
        }
        if(row==m-1){
            return matrix[row][col];
        }
        if(dp[row][col]!=200){
            return dp[row][col];
        }
        int down = MinimumFallingPath(matrix, col, row+1,dp);
        int downright = MinimumFallingPath(matrix, col-1, row+1,dp);
        int downleft = MinimumFallingPath(matrix, col+1, row+1,dp);
        return dp[row][col]= matrix[row][col] + Math.min(down, Math.min(downright, downleft));

    }
}