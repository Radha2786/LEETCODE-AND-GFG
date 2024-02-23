class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> lis = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        Combination(candidates,0,target,list,lis);
        return list;
    }
     public static void Combination(int[] candidates,int index,int target,List<List<Integer>> list,List<Integer> lis){
         if(target==0){
             list.add(new ArrayList<>(lis));
             return;
         }
         if(target<0){
             return;
         }
        for(int i=index;i<candidates.length;i++){
            lis.add(candidates[i]);
            Combination(candidates,i,target-candidates[i],list,lis);
            lis.remove(lis.size()-1);
        }
     }
}