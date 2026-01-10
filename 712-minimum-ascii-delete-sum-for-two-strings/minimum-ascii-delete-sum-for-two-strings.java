class Solution {
    int max=0;
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return Solve(0,0,s1,s2,dp);
    }
    public static int Solve(int i,int j,String s1,String s2,int[][] dp){
        if(i==s1.length() && j==s2.length()){
            return 0;
        }

        if(i>=s1.length()){
            return s2.charAt(j) + Solve(i,j+1,s1,s2,dp);
        }
        if(j>=s2.length()){
            return s1.charAt(i) + Solve(i+1,j,s1,s2,dp);
        }
         if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        if(s1.charAt(i)==s2.charAt(j)){
            return Solve(i+1,j+1,s1,s2,dp);
        }
        //2 options
        int delete_s1_i = s1.charAt(i) + Solve(i+1,j,s1,s2,dp);

        int delete_s2_j = s2.charAt(j) + Solve(i,j+1,s1,s2,dp);

        return dp[i][j]= Math.min(delete_s1_i,delete_s2_j);
    }
}