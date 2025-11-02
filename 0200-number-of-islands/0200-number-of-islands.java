class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
         int count =0;
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(visited[i][j]==0 && grid[i][j]=='1'){
                    count=count+1;
                    // call bfs
                    BFS(i, j, grid, visited);
                }
            }
        }
       return count;
    }

    public static void BFS(int row, int col, char[][] grid, int[][] visited){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        visited[row][col] = 1;  // Marking visited when adding to queue inorder to avoid TLE 
        int n = grid.length;
        int m = grid[0].length;
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            // 1. remove
            Pair p = q.poll();
            int r = p.first;
            int c = p.second;
            // 2. ignore
            
            // 4. add visited
           
            //5 add univisited neighbours
            for(int i=0;i<4;i++){
                    int nrow = r+delRow[i];
                    int ncol = c+delCol[i];
                   if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && grid[nrow][ncol]=='1'){
                        visited[nrow][ncol] = 1;  // Marking before enqueue
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
        } 
}