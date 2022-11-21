class Solution {
    public void nextPermutation(int[] arr) {
       int p1 = 0;
        for(int i = arr.length-2 ; i >=0 ; i--){
            if(arr[i] < arr[i+1]){
                p1 = i;
                break;
            }
        }
        int p2 = 0;
        for(int i = arr.length - 1 ; i > p1 ; i--){
            if(arr[i] > arr[p1]){
                p2 = i;
                break;
            }
        }
        
        if(p1 == 0 && p2 == 0){
            reversalAlgo(arr , 0 , arr.length - 1);
            return;
        }
        
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
        
        reversalAlgo(arr , p1+1 , arr.length - 1);
    }
    
    static  void reversalAlgo(int[] arr , int s , int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            
            s++;
            e--;
        }
    }
}