class Solution {
     private List<String> columnStates = new ArrayList<>();
     private final int MOD = 1_000_000_007;
     private int[][] t;
     
     public int numOfWays(int n) {
        GenerateColumnStates("", 0, 3, '#' ); // '#' denotes no previous color

        int numColumnPatterns = columnStates.size();
        t = new int[n][numColumnPatterns];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int result=0;
        for(int i=0;i<columnStates.size();i++){
            result = (result + Solve(n-1,i, 3)) % MOD;
        }
        return result;   
    }
    
    private void GenerateColumnStates(String currentColumn, int currlength, int m, char PrevChar ){
        if(currlength==m){
            columnStates.add(currentColumn);
            return;
        }
        for(char color: new char[]{'R','Y','G'}){
            if(color==PrevChar) continue;
            GenerateColumnStates(currentColumn+color, currlength+1, m, color);
        }
    }
    private int Solve(int remainingCol, int prevIndex, int m){
        // base case 
        if(remainingCol==0){
            return 1;
        }

        if (t[remainingCol][prevIndex] != -1) return t[remainingCol][prevIndex];

        int ways =0;
        String PrevState =  columnStates.get(prevIndex);

        for(int i=0; i < columnStates.size() ;i++){
            if(i==prevIndex) continue;
            String currentState =  columnStates.get(i);
            boolean valid = true;
            for(int j=0 ; j<m ; j++){  // iterating on currentstate and prev state just to match no same character
            if(PrevState.charAt(j) == currentState.charAt(j)){
                valid = false;
                break;
            }
            }
            if(valid){
                ways= (ways+ Solve(remainingCol-1, i, m)) % MOD;
            }
        }
        return t[remainingCol][prevIndex] = ways;
        // return ways;
    }
}