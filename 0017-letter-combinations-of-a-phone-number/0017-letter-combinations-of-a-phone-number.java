class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        Combinations(digits,"",list);
        return list;
    }

    static String[] numberofchoice = {"", "", "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void Combinations(String digits,String ans, List<String> list){
        if(digits.length()==0){
            list.add(ans);
            return;
        }
      int digit = digits.charAt(0)-'0';
      String alphabets = numberofchoice[digit];
      for(int i=0;i<alphabets.length();i++){
        Combinations(digits.substring(1),ans+alphabets.charAt(i),list);
      }
    }

}