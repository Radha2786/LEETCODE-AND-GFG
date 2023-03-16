//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] board, int n) {
        ArrayList<String> list = new ArrayList<>();
        Maze(board,0,0,list,"");
        return list;
    }
    static void Maze(int[][] board,int row, int col, ArrayList<String>list,String ans){
        if(row==board.length-1 && col==board[0].length-1){
            if(board[row][col]!=0){
                list.add(ans);
            }
            return;
        }
        if(row==board.length || col== board.length || row<0 || col<0 || board[row][col]==0){
            return ;
        }
        board[row][col]=0;
        
        // down call
        Maze(board,row+1,col,list,ans+'D');
        //up 
         Maze(board,row-1,col,list,ans+'U');
         //left
          Maze(board,row,col-1,list,ans+'L');
          // right
           Maze(board,row,col+1,list,ans+'R');
           
             board[row][col]=1;
    }
}