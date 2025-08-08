class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(k>n){
            return ll;
        }
        Combination(k, n , list,  ll, 1, 0);
        return ll;
    }

    public static void Combination(int k, int n , List<Integer> list, List<List<Integer>> ll, int index, int sum){
        if(index>9){
            if(sum==n && list.size()==k){
                ll.add(new ArrayList<>(list));
                return;
            }else{
                return;
            }
        }

        list.add(index);
        Combination(k, n , list, ll, index+1, sum+index);
        list.remove(list.size()-1);

        // not choose
        Combination(k, n , list, ll, index+1, sum);

    }
}