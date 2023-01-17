//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class ThirdLargestElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n =sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution g = new Solution();
			System.out.println(g.thirdLargest(arr,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int thirdLargest(int a[], int n)
    {
	    return third_largest(a);
    }
     static int third_largest(int[] arr){
        int largest = arr[0];
        int second_larget = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        for(int i = 1  ; i < arr.length ; i++){
            if(arr[i] > largest){
                third_largest = second_larget;
                second_larget = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_larget && arr[i] != largest){
                third_largest = second_larget;
                second_larget = arr[i];
            }
            else if(arr[i] > third_largest && arr[i] != second_larget && arr[i] != largest){
                third_largest = arr[i];
            }
        }
        if(third_largest > 0)
            return third_largest;
        else
            return -1;
    }
}
