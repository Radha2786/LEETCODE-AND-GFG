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
    	
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<n;i++){
        stack.push(i);
    }
    while(stack.size()>1){
        int indx1=stack.pop();
        int indx2=stack.pop();
        if(arr[indx1][indx2]==0 && arr[indx2][indx1]==1){
            stack.push(indx1);
        }
        if(arr[indx2][indx1]==0 && arr[indx1][indx2]==1){
            stack.push(indx2);
        }
    }
    if(!stack.isEmpty()){
    int candidate = stack.pop();
    for(int i = 0 ; i < arr.length ; i++){
    	    if(i == candidate){
    	        continue;
    	    }
    	    
    	    if(arr[i][candidate] == 0 || arr[candidate][i]==1){
    	        return -1;
    	    }
    	}
    	
    	return candidate;
    }else{
        return -1;
    }
    }
}