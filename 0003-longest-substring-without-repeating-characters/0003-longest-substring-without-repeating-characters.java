class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Brute force (Generate all substring) 
        int ans = 0;
        for(int i=0;i<s.length();i++){
            int[] arr = new int[255];
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==-1){
                    break;
                }
                ans = Math.max(ans,j-i+1);
                arr[s.charAt(j)]=-1;
            }
        }
        return ans;
    }
}