//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        String ans="";
        return remove_char(S,ans);
        
    }
    static String remove_char(String S, String ans){
        if(S.length()==1){
            return ans+S.charAt(0);
        }
        char ch =S.charAt(0);
        char ch2 = S.charAt(1);
        if(ch==ch2){
           return remove_char(S.substring(1),ans);
        }else{
           return remove_char(S.substring(1),ans+ch); 
        }
    }
}