class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> lis = new ArrayList<>();
         if(digits.length()==0){
            return lis;
        }
        LetterCombination(digits,lis,"");
        return lis;
    }
    static String[] choices_of_numbers ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static void LetterCombination(String digits,List<String> lis,String ans){
        if(digits.length()==0){
            lis.add(ans);
            return;
        }

        int digit=digits.charAt(0)-'0';
        String choices = choices_of_numbers[digit];
        for(int i=0;i<choices.length();i++){
            LetterCombination(digits.substring(1),lis,ans+choices.charAt(i));
        }
    }
}