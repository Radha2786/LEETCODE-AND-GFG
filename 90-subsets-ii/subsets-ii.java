class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // it is similar to combination sum 2
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
          List<List<Integer>> ll = new ArrayList<>();
          Subset(nums,list,ll,0);
          return ll;
    }
    public static void Subset(int[] arr,List<Integer> list,List<List<Integer>> ll,int index){
        ll.add(new ArrayList<>(list));
        for(int i=index;i<arr.length;i++){
            if(i==index || arr[i]!=arr[i-1]){
                list.add(arr[i]);
                Subset(arr,list,ll,i+1);
                list.remove(list.size()-1);
            }
        }
    }
}