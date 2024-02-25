class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min= Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];

        for(int row = 0 ; row <matrix.length ; row++){
            Arrays.fill(dp[row],Integer.MAX_VALUE);
        }

        for(int j=0;j<matrix[0].length ; j++){
            min=Math.min(minFallingPath(0,j,matrix,dp),min);
            
        }
        return min;
    }
    public static int minFallingPath(int row , int col , int[][] matrix, int[][] dp){

          if(col<0 || col>=matrix.length){
            return Integer.MAX_VALUE;
        }

        // Base condition
        if(dp[row][col]!= Integer.MAX_VALUE){
            return dp[row][col];
        }
        if(row==matrix.length-1){
            return matrix[row][col];
        }
      

        // call for left
        int left=minFallingPath(row+1,col-1,matrix,dp);
        int down=minFallingPath(row+1,col,matrix,dp);
        int right = minFallingPath(row+1,col+1,matrix,dp);
        dp[row][col]= matrix[row][col] + Math.min(left,Math.min(right,down));
        
        // return matrix[row][col] + Math.min(left,Math.min(right,down));
        return dp[row][col];


    }
}