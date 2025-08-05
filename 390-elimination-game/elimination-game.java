class Solution {
    public int lastRemaining(int n) {
        boolean left = true;
        int remain =n , step=1, head=1;
        while(remain>1){
            if (left || (remain % 2 == 1)) {
    head += step;
}

            step = step*2;
            remain=remain/2;
            left=!left;
        }
        return head;
    }
}