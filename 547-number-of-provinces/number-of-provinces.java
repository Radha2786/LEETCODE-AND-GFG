class Solution {
    public int findCircleNum(int[][] isConnected) {

        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();;

        Graph1(isConnected.length,map);

         for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                 if (isConnected[i][j] == 1 && i != j) {
            AddEdge(i + 1, j + 1, 0, map);
        }
            }
        }

       return BFT(map);
    }

    public void Graph1(int v,HashMap<Integer, HashMap<Integer, Integer>> map){
        
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<Integer, Integer>());
        }
    }
     public void AddEdge(int v1, int v2, int cost,HashMap<Integer, HashMap<Integer, Integer>> map){
        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
        map.get(v2).put(v1,cost);
    }

     public int BFT(HashMap<Integer, HashMap<Integer, Integer>> map){
        int count=0;
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int key: map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            count++; // in order to calculate no. of components or parts for disconnected graph
            queue.add(key);
            while(!queue.isEmpty()){
                // 1. remove
                int nbr=queue.poll();
                // 2. ignore if already visited
                if(visited.contains(nbr)){
                    continue;
                }
                //3. add visited
                visited.add(nbr);
                //4. selfwork
                // System.out.print(nbr+" ");
                //5. add unvisited neighbours
                for(int nbrs: map.get(nbr).keySet()){
                    if(!visited.contains(nbrs)){
                        queue.add(nbrs);
                    }
                }
            }
        }
        // System.out.println("count is: "+ count);
        return count;
        }
}

