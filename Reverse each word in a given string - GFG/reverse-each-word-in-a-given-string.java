//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWords (s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseWords(String S)
    {
        String str="";
        int p1=0,p2=0;
        while(p2<S.length()){
            if(S.charAt(p2)=='.'){
                str=str+reverseWord(S.substring(p1,p2)) + '.';
                p1=p2+1;
            }
            
                p2++;
            
        }
        str=str+reverseWord(S.substring(p1,p2));
        
        return str;
    }
    
    static String reverseWord(String s)
    {
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str=str+s.charAt(i);

        }
        return str;
    }
}