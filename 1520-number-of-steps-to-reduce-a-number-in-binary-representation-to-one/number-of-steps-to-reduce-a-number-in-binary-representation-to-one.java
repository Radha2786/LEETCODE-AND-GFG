class Solution {
    public int numSteps(String s) {
        int operation=0;
        int carry=0;
        int n = s.length();
        int i=n-1;
        while(i>=1){
            if(((s.charAt(i)-'0')+carry) % 2 !=0){
                // odd
                operation+=2;
                carry=1;
            }else{
                operation+=1;
            }
            i--;
        }
        return operation+carry;
    }
}