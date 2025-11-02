class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initialcolor = image[sr][sc];
        int n = image.length;
        int m = image[0].length;
        int[][] visited = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        visited[sr][sc] = 1;
         int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        while(!q.isEmpty()){
            // 1. remove
            Pair p = q.poll();
            int r = p.first;
            int c = p.second;
            // 2. ignore
            
            // 3. add visited
            image[r][c]=color;

           
            //5 add univisited neighbours
            for(int i=0;i<4;i++){
                    int nrow = r+delRow[i];
                    int ncol = c+delCol[i];
                   if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && visited[nrow][ncol]==0 && image[nrow][ncol]==initialcolor){
                        visited[nrow][ncol] = 1;  // Marking before enqueue
                        q.add(new Pair(nrow,ncol));
                    }
                }
            }
            return image;
    }
}