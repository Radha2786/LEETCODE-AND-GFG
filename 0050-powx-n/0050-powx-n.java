class Solution {
    public double myPow(double x, int n) {
        if(n<0){
          n = -1*n;
           Double ans = calcPower(x,n);
           return 1/ans;
        }else{
            Double ans = calcPower(x,n);
        return ans;
        }
        
    }

    public static double calcPower(double x, int n){

        if(n==0){
            return 1;
        }

        if(n % 2 == 0){
            return calcPower(x*x,n/2);
        }else{
           return x*calcPower(x,n-1);
        }
       
    }
}