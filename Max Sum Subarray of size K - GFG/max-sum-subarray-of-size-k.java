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
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int k, ArrayList<Integer> arr,int N){
        int s = 0;
        int e = 0;
        long max=0;
        // making window  
        while(e<k){
            max+=arr.get(e);
            e++;
        } 
        long current = max;
        while(e<arr.size()){
            // growing the window
            current=current+arr.get(e);
            // shrinking the window
            current=current-arr.get(s);
            if(current>max){
                max=current;
            }
            s++;
            e++;
        }
        return max;
    }
}