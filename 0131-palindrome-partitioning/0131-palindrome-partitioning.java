class Solution {
    public List<List<String>> partition(String s) {
        List<String> list = new ArrayList<>();
        List<List<String>> ll = new ArrayList<>();
        Partition(s, list, ll);
        return ll;
    }

    public static void Partition(String str, List<String> list, List<List<String>> ll){
        if(str.length()==0){
            ll.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<str.length();i++){
            if(isPallindrome(str.substring(0,i+1))){
                //   System.out.println(str.substring(0,i+1));
                  list.add(str.substring(0,i+1)); 
                   Partition(str.substring(i+1),list,ll);
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