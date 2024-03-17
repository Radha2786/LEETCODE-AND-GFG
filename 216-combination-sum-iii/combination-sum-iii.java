class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ls = new ArrayList<>();
        Combinationsum3(k,n,1,list,ls);
        return ls;
    }
    public static void Combinationsum3(int k, int n,int index, List<Integer> list, List<List<Integer>> ll){
        // base case
        if(list.size()==k && n==0){
            ll.add(new ArrayList<>(list));
            return;
        }
        if(list.size()==k){
            return;
        }
        for(int i=index;i<=9;i++){
            list.add(i);
             Combinationsum3(k,n-i,i+1,list,ll);
            //  System.out.println(list);
             list.remove(list.size()-1);
        }
       
    }
}