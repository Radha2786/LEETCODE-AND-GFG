class Solution {
      // By sliding window 
    public int maxScore(int[] arr, int k) {
        int leftsum=0;
        int rightsum=0;
        int maxsum=0;
        for(int i=0;i<=k-1;i++){
            leftsum+=arr[i];
            maxsum=leftsum;
        }
        int rightindex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum=leftsum-arr[i];
            rightsum+=arr[rightindex];
            rightindex--;
            maxsum=Math.max(leftsum+rightsum,maxsum);
        }
        return maxsum;
        
    }
}