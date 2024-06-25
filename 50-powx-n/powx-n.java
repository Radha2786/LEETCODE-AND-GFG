class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        if(nn<0){
            nn = -1 * nn;
        }
        Double ans = Power(x,nn);
        if(n<0){
            return 1/ans;
        }else{
            return ans;
        }
    }
    public static double Power(double x , long nn){
        if(nn==0){
            return 1;
        }

        if(nn % 2 == 0){
           return Power(x*x,nn/2);
        }else{
            return x*Power(x,nn-1);
        }

    }
}