class Solution {
    public int sumFourDivisors(int[] nums) {
        // similar approach as sieve-of-eratosthenes
        int result=0;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int count=0;
            int sum=0;
            for(int factorial=1; factorial *factorial <= num ; factorial++){
                if(num % factorial == 0){
                    int other = num/factorial;
                    if(other==factorial){
                        count+=1;
                    }else{
                        count+=2;
                        sum+=factorial+other;
                    }   
                }
                if(count>4) break;
            }
            if(count==4){
                result+=sum;
            }
        }
        return result;
    }
}