class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Two Pointers(Sliding window)
        int l =0;
        int r=0;
        int ans =0;
        HashMap<Character, Integer> map = new HashMap<>();
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
               int val = map.get(s.charAt(r));
               // update the window 
               if(val>=l){
                l=val+1;
               }
            }
            ans = Math.max(ans,r-l+1);
            map.put(s.charAt(r),r);
            r++;
        }
        return ans;
    }
}