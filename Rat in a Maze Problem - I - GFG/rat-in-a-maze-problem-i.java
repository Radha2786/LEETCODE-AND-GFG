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
        maze(board , 0 , 0 , list , "");
        if(list.size() == 0){
            list.add("-1");
        }
        return list;
    }
    
     static void maze(int[][] board , int r , int c , ArrayList<String> list , String ans){

//        BASE CONDITION
        if(r == board.length-1 && c == board.length-1){
            if(board[r][c] != 0){
                list.add(ans);
            }
            
            return;
        }

//          2ND BASE CONDITION
        if(r < 0 || r == board.length || c < 0 || c  == board.length || board[r][c] == 0){
            return;
        }

//        visited
        board[r][c] = 0;

//        MOVE DOWN
        maze(board , r+1 , c , list , ans+'D');

//        MOVE UP
        maze(board , r-1 , c , list , ans+'U');

//        MOVE RIGHT
        maze(board , r , c + 1 , list , ans+'R');

//        MOVE LEFT
        maze(board , r , c-1 , list , ans+'L');

//        unvisited
        board[r][c] = 1;

    }
}