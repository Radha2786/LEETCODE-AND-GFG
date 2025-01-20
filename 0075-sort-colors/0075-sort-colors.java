// Brute force Solution

class Solution {
    public void sortColors(int[] nums) {
        int CountZero = 0, CountOne = 0, CountTwo = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                CountZero++;
            }else if(nums[i]==1){
                CountOne++;
            }else{
                CountTwo++;
            }
        }
        for(int i=0;i<CountZero;i++){
            nums[i]=0;
        }
        for(int i=CountZero; i<CountZero+CountOne; i++){
            nums[i]=1;
        }
        for(int i= CountZero+CountOne ; i<nums.length;i++){
            nums[i]=2;
        }
    }
}