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
            String s[] = read.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int M = Integer.parseInt(s[1]);
            int Mat[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String S[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) {
                    Mat[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.findMaxSum(N, M, Mat));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int findMaxSum(int N, int M, int Mat[][]) {
        return max_hour_glass(Mat);
    }
    
      static int max_hour_glass(int[][] arr){
        int max = -1;
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(i == 0 || j == 0 || i == arr.length-1 || j == arr[i].length-1){
                    continue;
                }
                else{
                    sum = arr[i][j]+arr[i-1][j]+arr[i-1][j+1]+arr[i-1][j-1]+arr[i+1][j]+arr[i+1][j+1]+arr[i+1][j-1];
                    if(sum > max){
                        max = sum;
                    }
                }
            }

        }
        return max;
    }
};