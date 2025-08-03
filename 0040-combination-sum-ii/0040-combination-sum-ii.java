class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
               Arrays.sort(candidates);
//       1,1,2,3,5,6,7,10;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ll = new ArrayList<>();
        Combination(candidates, target, list, ll, 0, 0);
        // System.out.println(ll);
       return ll;
        
    }


    public static void Combination(int[] arr, int target, List<Integer> list, List<List<Integer>> ll, int sum, int index){
        if(sum==target){
            ll.add(new ArrayList<>(list));
            return;
        }
        if(sum>target){
            return;
        }
        //       1,1,2,3,5,6,7,10;
        for(int i=index;i<arr.length;i++){
            if(i==index || arr[i]!=arr[i-1]) {
                list.add(arr[i]);
                sum += arr[i];
                Combination(arr, target, list, ll, sum, i + 1);
                list.remove(list.size() - 1);
                sum = sum - arr[i];
            }
        }
    }
}