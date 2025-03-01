class Solution {
    public int numberOfSubstrings(String s) {
        // with every character there is a substring that ends 
        int[] arrmap = new int[3];
        int count=0;
        Arrays.fill(arrmap,-1);
        for(int i=0 ; i<s.length();i++){
            arrmap[s.charAt(i)-'a'] = i;
            if(arrmap[0] !=-1  && arrmap[1] !=-1 && arrmap[2] !=-1){
                count = count+ (1+ Math.min(arrmap[0] , Math.min(arrmap[1],arrmap[2])));
            }
        }
        return count;
    }
}