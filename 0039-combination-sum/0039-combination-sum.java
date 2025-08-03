class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        Combination(candidates, target, list, ll, 0,0);
        return ll;
    }
    public static void Combination(int[] arr, int target, List<Integer> list, List<List<Integer>> ll, int sum, int index){
        if(sum==target){
            ll.add(new ArrayList<>(list));
            // ll.add(list);
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=index;i<arr.length;i++){
            list.add(arr[i]);
            sum+=arr[i];
            Combination(arr, target, list, ll, sum,i);
            list.remove(list.size()-1);
            sum=sum-arr[i];
        }
    }
}