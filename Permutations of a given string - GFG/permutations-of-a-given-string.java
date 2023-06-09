//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
          ArrayList<String> list = new ArrayList<>();
        find_permutation(S,"",list);
        // System.out.println(list);
        Collections.sort(list);
        return list;
    }
  public static void find_permutation(String S,String ans,ArrayList<String> list){
        if(S.isEmpty()){
            list.add(ans);
            return;
        }
        for(int i=0;i<S.length();i++){
            Boolean flag = false;
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i)==S.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag==false) {
                String prefix = S.substring(0, i);
                String suffix = S.substring(i + 1);
                find_permutation(prefix + suffix, ans + S.charAt(i), list);
            }

        }
    }
}