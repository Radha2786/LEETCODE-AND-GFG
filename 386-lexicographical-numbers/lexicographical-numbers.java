class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList();
        Order(n, 0 ,list);
        list.remove(0);
        return list;
    }
    public static void Order(int n, int current, List<Integer> list){

        if(current>n){
            return;
        }

        list.add(current);
       
        int i = 0 ;
        if(current==0){
            i=1;
        }
        for(;i<=9;i++){
            Order(n, current*10+i, list);
        }
    }
}