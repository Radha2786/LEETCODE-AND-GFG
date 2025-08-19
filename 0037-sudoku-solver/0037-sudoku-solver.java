class Solution {
    public void solveSudoku(char[][] board) {
        Sudoku(board, 0, 0);
    }
     public static boolean Sudoku(char[][] board, int row, int col) {
        // base case
        if(col==board.length){
            col=0;
            row++;
        }
        if(row==board.length){
            // Print(board);
            return true;
        }

    if(board[row][col] != '.'){
        return Sudoku(board, row, col+1); // next column k liye check kr
    } else {
        for (char val = '1'; val <= '9'; val++) {
            if (checkSafe(val, row, col, board)) {
                board[row][col] = val;
                if(Sudoku(board, row, col + 1)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
    }
    return false;
    }

      public static boolean checkSafe(char val, int row, int col, char[][] board){
        for(int i = 0;i< board.length;i++){
            if(board[i][col]==val){
                return false;
            }
            if(board[row][i]==val){
                return false;
            }
            if(board[3* (row/3)+ i/3][3* (col/3) + i% 3]== val){
                return false;
            }
        }
        return true;
    }


}