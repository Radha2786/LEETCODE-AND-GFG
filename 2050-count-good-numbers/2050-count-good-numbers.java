class Solution {
    public int countGoodNumbers(long n) {
        int mod = 1000000007;
       // calculate even digits 
       long evendigits = (n+1)/2;
       // calculate odd digits 
       long odddigits = n/2;
       // calculate Power
      long evenProduct = power(5,evendigits,mod); 
      long oddProduct =  power(4,odddigits,mod);
       return (int) ((evenProduct * oddProduct) % mod) ;
    }

    public static long power(long base, long exp, int mod) {
        if (exp == 0) {
            return 1;
        }
        long halfPower = power(base, exp / 2, mod);
        long halfResult = (halfPower * halfPower) % mod;
        
        if (exp % 2 != 0) {
            halfResult = (halfResult * base) % mod;
        }
        
        return halfResult;
    }
}