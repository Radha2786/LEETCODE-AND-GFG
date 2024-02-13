class Solution {
    public String firstPalindrome(String[] words) {
        for( String str : words){
            boolean flag=isPalin(str);
            if(flag){
                return str;
            }
        }
        return "";
    }

    public static boolean isPalin(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}