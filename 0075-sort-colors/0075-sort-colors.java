class Solution {
    public void sortColors(int[] arr) {
        int l=0,m=0;
        int h =arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                int temp=arr[m];
                arr[m]=arr[l];
                arr[l]=temp;
                l++;
                m++;
            }
            else if(arr[m]==2){
                int temp=arr[m];
                arr[m]=arr[h];
                arr[h]=temp;
                h--;
            } else{
                m++;
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}