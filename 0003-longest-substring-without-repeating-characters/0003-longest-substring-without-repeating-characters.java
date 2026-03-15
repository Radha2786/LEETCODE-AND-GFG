class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start=0;
        int end=0;
        int maxLength=0;
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))){
                int val = map.get(s.charAt(end));
                if(val>=start){
                    start=val+1;
                }
            }
            maxLength= Math.max(maxLength,end-start+1);
            map.put(s.charAt(end),end);
            end++;
        }
        return maxLength;
    }
}