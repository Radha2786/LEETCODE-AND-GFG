class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        int first =-1;
        int last=-1;
         int[] arr= new int[2];
       
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                 first=m;
                e=m-1;
            }
            else if(nums[m]<target){
                s=m+1;
            } else{
                e=m-1;
            }
        }
        s=0;
        e=nums.length-1;
        
        while(s<=e){
            int m = s+(e-s)/2;
            if(nums[m]==target){
                last=m;
                s=m+1;
            }
            else if(nums[m]<target){
                s=m+1;
            } else{
                e=m-1;
            }
           
            
        }
        arr[0]=first;
        arr[1]=last;
        // return Arrays.toString(arr);
        return arr;
        
        
        
    }
}