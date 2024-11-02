class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }

        int i=0;
        int sign =1;

        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        if(i<s.length() && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(i<s.length() && s.charAt(i)=='+'){
            i++;
        }
        System.out.println(i);

        long num=0;
        while(i<s.length() && s.charAt(i) - '0' <=9 && s.charAt(i) - '0' >=0){
            int digit = s.charAt(i)- '0';
            num = num*10+digit;
            if(sign==-1){
                long check = -num;
                if(check < Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                    }
            }else{
                if(num > Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                }
                }
                i++;
        } 
                            
        return (int) num*sign;
    }
}