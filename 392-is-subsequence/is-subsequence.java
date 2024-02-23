class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        // two pointer approach
        int p1=0, p2=0;
        while (p2<t.length()){
            if( p1<s.length() && s.charAt(p1)!=t.charAt(p2)){
                p2++;
            }else if(p1<s.length()){
                p1++;
                p2++;
            }else{
                break;
            }
        }
        return p1==s.length();
    }
}