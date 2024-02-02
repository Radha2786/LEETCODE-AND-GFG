class Solution {
    public int trap(int[] arr) {
        // calculating leftmax,rightmax and then calculating min of leftmax and rightmax-height
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0]=arr[0];
        right[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
        for(int i = arr.length-2; i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]);
        }
        int ans = 0;
        for(int i=0;i<arr.length;i++){
           int min = Math.min(left[i],right[i]);
            ans = ans + (min - arr[i]);
        }
        return ans;
    }
}