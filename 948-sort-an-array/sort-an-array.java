class Solution {
    public int[] sortArray(int[] nums) {
        int b[] = sort(nums);
        return b;
    }
      public static int[] sort(int[] arr){

        // when reached length 1
        if(arr.length==1){
            return arr;
        }
        // dividing step
        int mid = arr.length/2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));
        // merging step
        return Merge(left,right);

    }
       public static int[] Merge(int[] left, int[] right){
        int[] mix = new int[left.length+ right.length];
        int i=0, j=0 , k=0;
        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k++]=left[i++];
            }else{
                mix[k++]=right[j++];
            }
        }
        while(i<left.length){
            mix[k++]=left[i++];
        }
        while (j<right.length){
            mix[k++]=right[j++];
        }
        return mix;
    }
}