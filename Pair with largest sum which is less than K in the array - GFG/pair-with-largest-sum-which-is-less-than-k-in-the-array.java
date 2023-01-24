//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.Max_Sum(a, n, k);
            for (int ii = 0; ii < res.size(); ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static ArrayList<Integer> Max_Sum(int[] arr, int n, int k) {
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();
        int s=0,max=0;
        int value_1=0;
        int value_2=0;
        int e=arr.length-1;
        while(s<e){
            if(arr[s]+arr[e]>=k){
                e--;
            }else{
                if(arr[s]+arr[e]>max){
                    max=arr[s]+arr[e];
                    value_1=arr[s];
                    value_2=arr[e];
                }
                s++;
            }
            
        }
        list.add(value_1);
        list.add(value_2);
        return list;
        
        
        
        
        
        
    }
}