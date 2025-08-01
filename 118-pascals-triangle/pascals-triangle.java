class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int i=1 ; i<=numRows ; i++){
            GenerateRow(i,ll,list);
        }
        return ll;
        
    }
    public void GenerateRow(int row, List<List<Integer>> ll, List<Integer> list){
        list.add(1);
        int ans=1;
        for(int i=1;i<row;i++){
            ans=ans*(row-i);
            ans=ans/i;
            list.add(ans);
        }
        ll.add(new ArrayList(list));
        list.clear();
    }
}