class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        CombinationSum(candidates,target,list,ll,0);
        return ll;
    }
    public static void CombinationSum(int[] candidates,int target,List<Integer> list,List<List<Integer>> ll,int index){
          if(target<0){
            return;
        }
        if(target==0){
            ll.add(new ArrayList<>(list));
            return;
        }
      
        for(int i=index;i<candidates.length;i++){
            list.add(candidates[i]);
            CombinationSum(candidates, target-candidates[i] , list , ll,i);
            list.remove(list.size()-1);
        }
       
    }
}