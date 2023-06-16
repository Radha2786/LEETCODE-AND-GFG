//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java


class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	return Celebrity(arr);
    }
    
     static int Celebrity(int[][] arr){
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            stack.push(i);
        }
        
        while (stack.size() > 1){
            int p1 = stack.pop();
            int p2 = stack.pop();
            
            if(arr[p1][p2] == 0 && arr[p2][p1] == 1){
                stack.push(p1);
            }
            
            if(arr[p2][p1] == 0 && arr[p1][p2] == 1){
                stack.push(p2);
            }
            
        }
        
         if(stack.isEmpty()){
            return -1;
        }

        int potential = stack.pop();
        for(int i = 0 ; i < arr.length ; i++){
            if(i == potential){
                continue;
            }
            
            // if(arr[i][potential] == 0){
            //     return -1;
            // }
            
            if(arr[i][potential] == 0 || arr[potential][i] == 1){
                return -1;
            }
        }
        
        return potential;
    }
}