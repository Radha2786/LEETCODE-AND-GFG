class Solution {
    public int minDistance(String word1, String word2) {
        
       return EditDistanceBU(word1, word2);
    }
    public static int EditDistanceBU(String s1, String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        // filled base cases
        // filling column first
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i;
        }
//        filling row first
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=j;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else {
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                System.out.print(dp[i][j]);
            }
            System.out.println();
        }
        return dp[s1.length()][s2.length()];
    }
}