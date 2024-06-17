class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i< 4 ; i++){
            if(checkIsSame(mat,target)) return true;
            rotate(mat);
        }
        return false;
    }

    public boolean checkIsSame(int[][] arr1, int[][] arr2){
        if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){
            for(int i=0;i<arr1.length ; i++){
                for(int j=0;j<arr1[0].length ; j++){
                    if(arr1[i][j]!= arr2[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

     public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                //swap
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        // reverse each row 
        for(int[] arr : matrix){
            int p1=0 , p2=n-1;
            while(p1<p2){
                int temp = arr[p1];
                arr[p1]= arr[p2];
                arr[p2]=temp;
                p1++;
                p2--;
            }
        }
    }
}