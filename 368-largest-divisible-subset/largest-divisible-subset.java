class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int[] dp =  new int[nums.length];
        List<Integer> list = new ArrayList();
        Arrays.fill(dp,1);
        Arrays.sort(nums);
        int maxIndex=0 , maxSize=1;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
                    dp[i]= Math.max(dp[i],dp[j]+1);
                        if(dp[i]>maxSize){
                            maxSize = dp[i];
                            maxIndex=i;
                        }
                        
                }
            }
        }
        System.out.println(maxSize);
        System.out.println(maxIndex);
        // creating array
        int num = nums[maxIndex];
        for(int i=maxIndex; i>=0; i--){
            if(num % nums[i]==0 && dp[i] == maxSize){
                list.add(nums[i]);
                maxSize--;
                num = nums[i];
            }
        }
        return list;

    }
}