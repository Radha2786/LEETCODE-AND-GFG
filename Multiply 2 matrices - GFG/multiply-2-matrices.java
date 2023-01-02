//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrixA = new int[n][n];
            int[][] matrixB = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixA[i][j] = Integer.parseInt(S[j]);
            }
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrixB[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            ob.Mutliply(matrixA, matrixB);
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(matrixA[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void  Mutliply(int[][] matrixA, int[][] matrixB)
    {
        int n =matrixA.length;
        int[][] ans=new int[n][n];
        for(int i=0;i<matrixA.length;i++){
            for(int j=0;j<matrixB.length;j++){
                for(int k=0;k<matrixA.length;k++){
                    ans[i][j]+= matrixA[i][k]*matrixB[k][j];  
                }
              
                
            }
        }
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                matrixA[i][j]=ans[i][j];
            }
        }
    }
}