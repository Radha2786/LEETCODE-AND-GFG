class Solution {
    public List<String> validStrings(int n) {
        String str ="";
        List<String> list = new ArrayList<>();
        validString( n, 0, str,list);   
        return list;
    }
     public static List<String> validString(int n,int i, String str, List<String> list) {
        if(i==n){
            list.add(str);
            return list;
//            return list;
        }
//        for(int j=i;j<n;j++){
            if(i==0 || str.charAt(i-1)!='0'){
                validString(n, i+1, str+"0",list);
            }
            validString(n,i+1,str+"1",list);

//        }
        return list;
    }
}