class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        List<List<String>> ls = new ArrayList<>();
        Partitioning(s,ll,ls);
        return ls; 
    }
    public static void Partitioning(String question,List<String> list,  List<List<String>> ll){

        if(question.isEmpty()){
            ll.add(new ArrayList<>(list));
            return ;
        }
        
        for(int i=1; i<=question.length();i++){
            String str = question.substring(0,i);
            if(isPallindrome(str)){
                list.add(str);
                Partitioning(question.substring(i),list,ll);
                list.remove(list.size()-1);
            }
        }
       
    }

    public static boolean isPallindrome(String str){
        int s=0;
        int e= str.length()-1;
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