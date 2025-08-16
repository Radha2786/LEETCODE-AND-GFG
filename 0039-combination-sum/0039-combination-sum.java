class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Combination(candidates, target, ll, list, 0);
        return ll;
    }

    public static void Combination(int[] candidates, int target,List<List<Integer>> ll, List<Integer> list, int index){
        if(target==0){
            ll.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(target>=candidates[i]){
                list.add(candidates[i]);
                Combination(candidates, target-candidates[i], ll, list, i);
                list.remove(list.size()-1);
            }  

        }
    }
}