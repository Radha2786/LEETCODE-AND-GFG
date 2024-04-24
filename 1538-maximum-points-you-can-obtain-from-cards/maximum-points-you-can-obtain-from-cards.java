class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum =0 , rsum=0;
        int maxsum=0;
        int Maxi=0;
        int j= arr.length-1;
        for(int i=0;i<k;i++){
            lsum = lsum + arr[i];
            maxsum = lsum;
        }
        Maxi=maxsum;
        System.out.println(maxsum);
        for(int i=k-1; i>=0 ; i--){
            maxsum= maxsum - arr[i];
            maxsum= maxsum + arr[j];
            j--;
            Maxi = Math.max(Maxi, maxsum);
        }
        return Maxi;


    }
}