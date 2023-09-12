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
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPerfectNumber(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        long factorSum = 1;
        if(N <= 1){
            return 0;
        }
        
        for(int i = 2 ; i <= Math.sqrt(N) ; i++){
            if(N%i == 0){
                factorSum += i;
                factorSum += N/i;
            }
        }
        
        return factorSum == N ? 1 : 0;
    }
};