//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends

//User function Template for Java

class Solution{
    
  
    String calc_Sum(int arr1[], int n, int arr2[], int m)
    {
          int p1= arr1.length-1;
        int p2= arr2.length-1;
        int carry=0,sum=0;
        int digit=0;
        ArrayList<Integer> list = new ArrayList<>();
        while(p1>=0 && p2>=0){
             sum=arr1[p1]+arr2[p2]+carry;
            carry=sum/10;
            digit=sum%10;
            list.add(0,digit);
            p1--;
            p2--;
        }
        if(p1!=-1) {
            while (p1 >= 0) {
                sum = arr1[p1] + carry;
                carry = sum / 10;
                digit = sum % 10;
                list.add(0, digit);
                p1--;

            }
        }else{
            while(p2>=0){
                sum=arr2[p2]+carry;
                carry=sum/10;
                digit=sum%10;
                list.add(0,digit);
                p2--;
            }
        }
        if(carry!=0){
            list.add(0,carry);
        }
        
        
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < list.size() ; i++){
            if(i == 0 && list.get(i) == 0){
                continue;
            }
            
            builder.append(list.get(i));
        }
        
        return builder.toString();
    }
  
    
}

//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray_N = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray_N];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_N;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    String line2 = br.readLine();
		    String[] ele = line2.trim().split("\\s+");
		    int sizeOfArray_M = Integer.parseInt(ele[0]);
		    
		    int brr [] = new int[sizeOfArray_M];
		    
		    line2 = br.readLine();
		    String[] elements2 = line2.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray_M;i++){
		        brr[i] = Integer.parseInt(elements2[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    String res = obj.calc_Sum(arr, sizeOfArray_N, brr, sizeOfArray_M);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


            


// } Driver Code Ends