class Solution {
    public int maximalRectangle(char[][] matrix) {
         int max_area=0;
        int[] arr = new int[matrix[0].length];
        for(int i=matrix.length-1; i>=0; i--){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]=='0'){
                    arr[j]=0;
                }else{
                    arr[j]+=1;
                }
            }
            int current_area=Histogram(arr);
            max_area=Math.max(current_area,max_area);
        }
        // System.out.println(max_area);
        return max_area;
        
    }
      static int Histogram(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int max_area=0;
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int right_index=i;
                int element=heights[stack.pop()];
                if(stack.isEmpty()){
                    int area = element*right_index;
                    max_area= Math.max(area,max_area);
                }else{
                    int left_index=stack.peek();
                    int area= element*(right_index-left_index-1);
                    max_area= Math.max(area,max_area);
                }
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int ele = heights[stack.pop()];
            int right_index=heights.length;
            if(stack.isEmpty()){
                int area = ele*right_index;
                max_area= Math.max(area,max_area);
            }else{
                int left_index=stack.peek();
                int area= ele*(right_index-left_index-1);
                max_area= Math.max(area,max_area);
            }
        }
        return max_area;
    }
}