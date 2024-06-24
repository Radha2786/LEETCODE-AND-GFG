class Solution {
    public int myAtoi(String str) {
        int ans = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        int sign = 1 ; //change the sign to -1 if negative 
        int size= str.length();
        int i = 0;
        if(size==0){
            return 0;
        }
        while(i < size && str.charAt(i)==' '){
            i++;
        }
        System.out.println(str);
        System.out.println(size);
        if(i < size && (str.charAt(i)=='-' || str.charAt(i)=='+')){
            if(str.charAt(i)=='-'){
                sign = -1;
            }
            i++;
        }

        while(i<size && str.charAt(i)-'0'<=9 && str.charAt(i)-'0'>=0){
            int digit = str.charAt(i)-'0';
            if(ans > max/10 || ans == max/10 && digit>max%10 ){
              return  (sign == 1) ? max : min ;
            }
            ans= ans*10+digit;
            i++;
        }
        return sign*ans;


    }
}