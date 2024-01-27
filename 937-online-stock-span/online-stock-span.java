class StockSpanner {
    ArrayList<Integer> list;
    Stack<Integer> stack;
    public StockSpanner() {
        stack = new Stack<Integer>();
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        int ans=0;
        int i=list.size()-1;
        while(!stack.isEmpty() && list.get(i)>=list.get(stack.peek())){
            stack.pop();
        }
        if(stack.isEmpty()){
            ans=i+1;
        }else{
           ans= i-stack.peek();
        }
        stack.push(i);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */