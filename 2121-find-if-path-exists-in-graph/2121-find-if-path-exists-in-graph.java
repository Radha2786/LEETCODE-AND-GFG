class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
       
        // Fill adjacency list for an undirected graph
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);       
        }

        // Print adjacency list to verify
        // for (int i = 0; i < adj.size(); i++) {
        //     System.out.println(i + " -> " + adj.get(i));
        // }
        HashSet<Integer> visited = new HashSet<Integer>();
        return HasPath(source, destination, visited, adj);

    }

    public static boolean HasPath(int src, int des, HashSet<Integer> visited, ArrayList<ArrayList<Integer>> adj){
        if(src==des){
            return true;
        }
        visited.add(src);
        for(int neighbor: adj.get(src)){
            if(!visited.contains(neighbor)){
            boolean ans=HasPath(neighbor, des, visited, adj);
            if(ans){
                return true;
            }
            }
        }
        return false;
    }
}