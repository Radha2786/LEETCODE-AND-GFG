class Solution {
    public int[][] merge(int[][] arr) {
        int n = arr.length ;
        // sort first 
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return (a[0] - b[0]);
            }
        });

        for(int i=0;i<n ; i++){
            int start = arr[i][0] ;
            int end = arr[i][1] ;

            // skipping all merged intervals
            if(!ans.isEmpty() && end <= ans.get( ans.size() - 1 ).get(1)){
                continue;
            }

            for(int j=i+1;j<n;j++){
                if(arr[j][0]<=end){
                    end = Math.max(end,arr[j][1]);
                }else{
                    break;
                }
            }
            ans.add(Arrays.asList(start,end));
            // pushing in ans arraylist 

        }
        int m = ans.size();
        int[][] answerArray = new int[m][2];

        for(int i=0; i<m ; i++){
            for(int j=0 ; j<2 ; j++){
                answerArray[i][j] = ans.get(i).get(j);
            }
        }
        return answerArray;
    }
}