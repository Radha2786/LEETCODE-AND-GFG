class Solution {
    class BipartitePair{
        int vtx;
        int dist;
        BipartitePair(int vtx, int dist){
            this.vtx=vtx;
            this.dist= dist;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<BipartitePair> queue = new LinkedList<>();
        HashMap<Integer,Integer> visited = new HashMap<>();
        for(int key=0;key<graph.length;key++){
            if(visited.containsKey(key)){
                continue;
            }
            queue.add(new BipartitePair(key,0));
            while(!queue.isEmpty()){
                //1.remove
                BipartitePair rv =  queue.poll();
                //2. ignore if already visited
                if(visited.containsKey(rv.vtx)){
                    if(visited.get(rv.vtx)!=rv.dist){
                        return false;
                    }
                    continue;
                }
                //3. mark visited
                visited.put(rv.vtx,rv.dist);
                // 4. self work nothing here
                // 5. add unvisited nbrs
                for(int nbrs: graph[rv.vtx]){
                    if(!visited.containsKey(nbrs)){
                        queue.add(new BipartitePair(nbrs, rv.dist+1));
                    }
                }
            }
        }
        return true;
    }
}