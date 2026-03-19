class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end =0;
        int longest=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(end<s.length()){
            if(map.containsKey(s.charAt(end))){
                int newindex = map.get(s.charAt(end));
                if(newindex>=start){
                      start=newindex+1;
                }
            }
            longest=Math.max((end-start)+1,longest);
            map.put(s.charAt(end),end);
            end++;   
        }
        return longest;
    }
}