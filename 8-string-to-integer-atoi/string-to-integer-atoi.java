class Solution {
    public int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        int i=0;
        int sign=1;
        int answer = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while(i<str.length() && str.charAt(i)==' '){
            i++;
        }
        if(i<str.length() && str.charAt(i)=='-'){
            sign = sign*-1;
            i++;
        }else if(i<str.length() && str.charAt(i)=='+'){
            i++;
        }

        while(i<str.length() && str.charAt(i)-'0'<=9 && str.charAt(i)-'0'>=0){
            int digit = str.charAt(i)-'0';
            // answer= answer*10 + digit;
            // if(sign==-1 && -1*answer<min){
                // return min;
            // }else if(sign==1 && answer>max){
                // return max;
            // }
            // -1 * (-2147483648) = -2147483648  // wait... huh?
            // Suppose we're processing:
            // Input: "-91283472332"
            // Let’s assume answer = 214748364
            // Now the next digit is 8
            // answer = answer * 10 + 8
        // = 2147483640 + 8
        // = 2147483648 → this is **1 more than Integer.MAX_VALUE**
        // \U0001f635 Java silently overflows:
        // answer = -2147483648  // (wrapped around garbage)
        // Now your check:
// if (sign == -1 && -1 * answer < min)
// Becomes:
// if (-1 * (-2147483648) < -2147483648)
// -1 * (-2147483648) = -2147483648  // wait... huh?

// \U0001f92f Why isn't it +2147483648?
// Because +2147483648 doesn't exist in Java's int!
// Java int range is:
// -2147483648 to 2147483647

// So -1 * Integer.MIN_VALUE = Integer.MIN_VALUE — it overflows again!

// This is a very famous Java quirk:
// -Integer.MIN_VALUE == Integer.MIN_VALUE ❗️

if (answer > (Integer.MAX_VALUE - digit) / 10) {
    return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
}
answer= answer*10 + digit;
            i++;
        }
        return (int) answer*sign;
    }
}