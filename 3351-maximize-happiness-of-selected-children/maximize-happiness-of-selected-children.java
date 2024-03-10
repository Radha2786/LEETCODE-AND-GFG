class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        long c=0, ans=0;
        Arrays.sort(happiness);
        for(int i=n-1;i>=0 && k>0 ; i--){
            if(happiness[i]-c<0){
                return ans;
            }
            ans+=happiness[i]-c;
            k--;
            c++;
        }
        return ans;
    }
}