class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r=0,l=0,n=s.length();
        int[] arr = new int[256];
        Arrays.fill(arr,-1);
        int MaxLength=0;
        while(r<n){
            // mil gya
            if(arr[s.charAt(r)] != -1){
                if(arr[s.charAt(r)]>=l){
                    l = arr[s.charAt(r)]+1;
                }
            }
            int length = r-l+1;
            MaxLength = Math.max(length, MaxLength);
            arr[s.charAt(r)]=r;
            r++;
        }
        return MaxLength;
    }
}