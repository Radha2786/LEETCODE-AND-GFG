class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        
        return Delete(word1,  word2, 0,0,dp);   
    }
    public static int Delete(String word1, String word2,int i, int j,int[][] dp){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }
        int step1=0;
        int step2=0;
        int ans=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            ans=ans+Delete( word1,  word2, i+1,  j+1, dp);
        }else {
            // delete from string 1
            step1= 1+ Delete(word1, word2, i + 1, j,dp);
            // delete from string 2
            step2= 1+ Delete(word1, word2, i , j+1,dp);
        }
        return dp[i][j]=ans+Math.min(step1,step2);
    }
}