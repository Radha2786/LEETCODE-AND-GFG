class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] C = new int[A.length];
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<B.length;i++){
            int count=0;
            for(int j=0;j<=i;j++){
            int k = B[j];
                if(set.contains(k)){
                    count++;
                }else{
                    for(int l=0;l<=i;l++){
                        if(A[l]==k){
                            count++;
                            set.add(k);
                        }
                    }
                }
            }
           C[i]= count;
           
        }
        return C;
    }
}