class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> res = new ArrayList<>();
        splitIntoFibo(num,0,res);
        return res;
    }
    public static boolean splitIntoFibo(String str, int index,List<Integer> res){
        if(index==str.length()){
            return res.size()>2;
        }
        int num=0;
        for(int i=index ; i<str.length(); i++){
            num= (num*10) + (str.charAt(i)-'0');
            if(num<0) return false;
            if(res.size() <2 || res.get(res.size()-1) + res.get(res.size()-2) == num){
                res.add(num);
               if(splitIntoFibo(str,i+1,res)) return true;
               res.remove(res.size()-1);
            }
            if(num==0) return false;
        }
        return false;
    }
}