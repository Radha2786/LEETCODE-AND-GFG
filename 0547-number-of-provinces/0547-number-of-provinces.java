class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]!=0 && i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
         int ans = DFT(adj);
         return ans;
    }

    public int DFT(List<List<Integer>> adj){
         int count = 0;
         Queue<Integer> q = new LinkedList<>();
         HashSet<Integer> visited = new HashSet<>();
         for (int i = 0; i < adj.size(); i++) {
      if (!visited.contains(i)) {
        q.add(i);
      } else {
        continue;
      }
      count++;

      while (!q.isEmpty()) {
        // 1. remove
        int rb = q.poll();
        // 2. continue
        if (visited.contains(rb)) {
          continue;
        }

        visited.add(rb);

        for (int nbrs : adj.get(rb)) {
          if (!visited.contains(nbrs)) {
            q.add(nbrs);
          }
        }
      }
    }
    return count;
    }
}