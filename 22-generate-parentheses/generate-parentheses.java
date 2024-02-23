class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        Generate_Paranthesis(n, n,n, list, "");
        return list;
    }
    public static void Generate_Paranthesis(int opening,int n, int closing, List<String> list, String ans){
        if(opening==0 && closing==0){
            list.add(ans);
            return ;
        }
        if(opening<0 || closing <0){
            return ;
        }
        // call for open bracket
       
            Generate_Paranthesis(opening-1,n,closing, list, ans+'(');
            
        // call for closing bracket

        if(closing>opening){
             Generate_Paranthesis(opening,n,closing-1, list, ans+')');
        }

           
            
      

    }
}