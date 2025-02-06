class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int r = k-1;
        int l = arr.length-1;
        int MaxSum = sum;
        while(l>arr.length-1-k){
            sum= sum-arr[r];
            sum+=arr[l];
            MaxSum = Math.max(sum,MaxSum);
            l--;
            r--;
        }
        return MaxSum;
    }
}