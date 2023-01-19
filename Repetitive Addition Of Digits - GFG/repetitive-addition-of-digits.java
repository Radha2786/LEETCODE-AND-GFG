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
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            int ans  = ob.singleDigit(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int singleDigit(long N){
        return single_Digit(N);
    }
    static int single_Digit(long N){
        while (N > 9){
            int n = sum_of_digits(N);
            N = n;
        }
        return (int) N;
    }

    static int sum_of_digits(long n){
        int SOD = 0;
        while (n > 0){
            SOD += n%10;
            n /= 10;
        }
        return SOD;
    }
}