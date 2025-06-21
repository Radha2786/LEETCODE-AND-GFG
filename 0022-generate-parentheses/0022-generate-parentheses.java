class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        // List<Character> list = new ArrayList<>();
        Generate(n, 0, 0,ans,"");
        return ans;
    }

    public static void Generate(int n, int open, int close, List<String> ans, String str){
        if(open== n && close==n){
            ans.add(str);
            return;
        }
        
        if(open<n){
            Generate(n, open+1, close,ans, str+"(");

        }
        if(close<n && open>close){
            Generate(n, open, close+1, ans,str+ ")");
        }
                
    }
}