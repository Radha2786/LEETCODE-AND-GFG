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
            String S[] = read.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            System.out.println(ob.countPrimes(L, R));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countPrimes(int L, int R) {
        //     if(n == 0 || n == 1){
        //     return 0;
        // }
        return primeSeives(R,L);
    }
    
    static int primeSeives(int R, int L){
        boolean[] arr = new boolean[R+1];
        int n=R;
        arr[0] = arr[1] = true;
        for(int i = 2;i*i<=n;i++){
            if(arr[i] == false){
                for(int j=2;i*j<=n;j++){
                    arr[j*i]=true;
                }
            }
        }
        int count = 0;
        for(int i = L; i <=R; i++){
            if(arr[i] == false){
                // System.out.print(i + " ");
                count++;
            }
        }
//        System.out.println(count);
        return count;
    }
};