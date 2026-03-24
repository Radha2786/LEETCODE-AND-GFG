class Pair<K,V>{
    K key;
    V value;

    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}
class Solution {
    public int maxProductPath(int[][] grid) {
        final int MOD = 1000000007;
        int n = grid.length;
        int m = grid[0].length;
        Pair<Long,Long>[][] dp = new Pair[n][m];
        Pair<Long,Long> result = solve(0,0,grid,n,m,dp);
        return result.getKey() < 0 ? -1 : (int) (result.getKey() % MOD);

    }

    public Pair<Long,Long> solve(int i, int j, int[][] grid,int n, int m, Pair<Long,Long>[][] dp){
        //base case
        if(i==n-1 && j==m-1){
            return new Pair<>((long) grid[i][j], (long) grid[i][j]);
        }

         // memo check
        if(dp[i][j] != null){
            return dp[i][j];
        }

        long MaxVal = Long.MIN_VALUE;
        long MinVal = Long.MAX_VALUE;

        //move down 
        if(i+1<n){
        Pair<Long,Long> down = solve(i+1,j,grid,n,m,dp);
        MaxVal=Math.max(MaxVal,Math.max(grid[i][j]*down.getKey(),grid[i][j]*down.getValue()));
        MinVal=Math.min(MinVal,Math.min(grid[i][j]*down.getKey(),grid[i][j]*down.getValue()));
        }

        //move right
        if(j+1<m){
            Pair<Long,Long> right = solve(i,j+1,grid,n,m,dp);
            MaxVal=Math.max(MaxVal,Math.max(grid[i][j] * right.getKey(), grid[i][j] * right.getValue()));
            MinVal=Math.min(MinVal,Math.min(grid[i][j]*right.getKey(),grid[i][j]*right.getValue()));
        }
        return dp[i][j] = new Pair<>(MaxVal,MinVal);
    }
}