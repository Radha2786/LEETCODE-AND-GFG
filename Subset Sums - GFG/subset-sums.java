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
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> list = new ArrayList<>();
        Sum_of_subsets(arr,N,list,0,0);
        Collections.sort(list);
        return list;
    }
    static void Sum_of_subsets(ArrayList<Integer> arr , int N , ArrayList<Integer> list,int i,int sum){
        if(i==N){
            list.add(sum);
            return;
        }
        // call of choosing
        Sum_of_subsets(arr,N,list,i+1,sum + arr.get(i));
        // call of not choosing
        Sum_of_subsets(arr,N,list,i+1,sum);
    }
}