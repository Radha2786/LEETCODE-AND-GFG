class Solution {
    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Partition(s,n,0,dp)-1;
    }
    public static int Partition(String str, int n, int index,int[] dp){
        if(index==n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }
        int min = Integer.MAX_VALUE;
        for(int j=index ; j< n ; j++){
            if(isPallindrome(str,index,j)){
                int cur=Partition(str,n,j+1,dp);
                min= Math.min(cur,min);
            }
        }
        return dp[index]=min+1;
    }
    public static boolean isPallindrome(String str, int s,int e){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}