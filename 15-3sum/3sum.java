class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //space optimised code 
        // for each i we are calculating 2 sum with sum = -a[i]
        // i+left+right
        // a[i]+a[left]+a[right]=0
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int left = i+1;
                int right = n-1;
                int target = -1*nums[i];
                while(left<right){
                    int sum = nums[left]+nums[right];
                    if(sum<target){
                        left++;
                    }else if(sum>target){
                        right--;
                    }else{
                        ls.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left - 1]) left++;
                        while(left < right && nums[right] == nums[right + 1]) right--;
                    }
                   
                }
            }
        }
         return ls;
    }
}