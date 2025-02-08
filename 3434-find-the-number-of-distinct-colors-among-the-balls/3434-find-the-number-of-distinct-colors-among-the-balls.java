class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];
        // 1st step maintaining color map 
        Map<Integer, Integer> colMap = new HashMap<>(); // from specific ball number to the corresponding
        //  color
        Map<Integer, Integer> revMap = new HashMap<>(); // from corresponding color to count of number of       balls having that color.

        for(int i=0;i<n;i++){
            int x = queries[i][0], y=queries[i][1];
            // x is the ball no. and y is the color no. 
            // int exY = colMap.get(x);
             int exY = colMap.getOrDefault(x, 0); // returns the existing color of the ball which I'm abt to overwrite 
             // if it exists , reduce the number of frequencies of the ball of existing color 
             if(revMap.containsKey(exY)){
                revMap.put(exY, revMap.get(exY)-1);
                if(revMap.get(exY)==0) revMap.remove(exY);
             }
             revMap.put(y, revMap.getOrDefault(y,0)+1);
             colMap.put(x,y);
             res[i] = revMap.size();
        }
        return res;



    }
}