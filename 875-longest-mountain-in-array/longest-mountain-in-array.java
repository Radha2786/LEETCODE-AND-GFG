class Solution {
    public int longestMountain(int[] arr){
          return minimumRemovals(arr);
    }
      public int minimumRemovals(int[] arr) {
        int[] LIS = LIS(arr);
        int[] LDS = LDS(arr);

    
        System.out.println(Arrays.toString(LIS));
        System.out.println(Arrays.toString(LDS));

        int max = 0;
        for(int i = 0 ; i < arr.length ; i++){
              if(LIS[i] > 1 && LDS[i] > 1)
            max = Math.max(max , LIS[i] + LDS[i]);
        }

        return max != 0 ? max - 1 : 0;
    }
       private int[] LDS(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp , 1);
        for(int i = arr.length - 2 ; i >= 0 ; i--){
            if(arr[i] > arr[i+1]){
                dp[i] = dp[i+1] + 1;
            }
        }
        return dp;
    }
     private int[] LIS(int[] arr){
        int[] dp = new int[arr.length];
        Arrays.fill(dp , 1);
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > arr[i-1]){
                dp[i] = dp[i-1] + 1;
            }
        }
        return dp;
    }
}