class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
          int[][] dp = new int[dungeon.length][dungeon[0].length];
          for(int row = 0 ; row <dungeon.length ; row++){
            Arrays.fill(dp[row],Integer.MAX_VALUE);
        }
       return  Dungeon(0,0,dungeon, dp);
    }
    public static int Dungeon(int row,int col,int[][] arr, int[][] dp){
        if(row== arr.length || col == arr[0].length){
            return Integer.MAX_VALUE;
        }

          if(dp[row][col]!= Integer.MAX_VALUE){
            return dp[row][col];
        }
        if(row==arr.length-1 && col==arr[0].length-1){
            return arr[row][col] < 0 ? 1 - arr[row][col] : 1;
        }

        // right
         int right= Dungeon(row,col+1,arr,dp);
         // down call
         int down=  Dungeon(row+1,col,arr,dp);
         int requiredHP= Math.min(right,down) - arr[row][col];
         
        int ans= requiredHP <= 0 ? 1 : requiredHP ; 
        dp[row][col]= ans;
        return dp[row][col];


    }
}