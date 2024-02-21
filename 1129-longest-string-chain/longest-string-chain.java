
class Solution {
    public int longestStrChain(String[] words) {
       
        Arrays.sort(words,comp);
        int n = words.length;
        int max = 1;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(Compare(words[i],words[j])){
                    dp[i]= Math.max(dp[j]+1,dp[i]);
                    max = Math.max(dp[i],max);
                }
            }
        }
        return max;
    }

     public static Comparator<String> comp = (s1, s2) -> s1.length() - s2.length();

    public static boolean Compare(String str1, String str2){
        if(str1.length()!=str2.length()+1){
            return false;
        }
        if(str1.length()>str2.length()){
            int p1 =0 , p2=0;
            while(p1<str1.length()){
                if( p2<str2.length() && str1.charAt(p1)==str2.charAt(p2)){
                    p1++;
                    p2++;
                }else{
                    p1++;
                }
            }
            if(p1==str1.length() && p2==str2.length()){
                return true;
            }
          
        }
          return false;
    }
}