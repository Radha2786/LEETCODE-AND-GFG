//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            String result = ob.firstAlphabet(S);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String firstAlphabet(String S) {
        char ch=S.charAt(0);
        String new_str="";
        new_str+=ch;
        int p1=1;
        int p2=2;
        while(p2<S.length()){
             p2=p1+1;
            if(S.charAt(p1)==' ' && S.charAt(p2)!=' '){
                 new_str+= S.charAt(p2);
            }
            p1++;
        }
            
        
        return new_str;
    }
};