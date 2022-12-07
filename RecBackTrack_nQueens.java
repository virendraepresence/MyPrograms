import java.util.*;
public class RecBackTrack_nQueens {

    public static void nQueenPossiblePlaces(boolean[][] board, int row, boolean[] columns, boolean[] diagonals,
                                boolean[] rDiagonals, String answerSoFar){
        
        if(row == board.length){
            System.out.println(answerSoFar + ".");
            return;
        }

       for(int col = 0; col<board[0].length; col++){
            if(columns[col] == false &&  diagonals[row + col] == false && rDiagonals[row-col + board.length - 1] == false){
                board[row][col] = true;
                columns[col] = true;
                diagonals[row + col] = true;
                rDiagonals[row-col + board.length - 1] = true;
                nQueenPossiblePlaces(board, row+1, columns, diagonals, rDiagonals, answerSoFar + row + "-" + col + ", ");
                board[row][col] = false;
                columns[col] = false;
                diagonals[row + col] = false;
                rDiagonals[row-col + board.length - 1] = false;
            }
       }
    
    
    }
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n]; 
        boolean[] columns = new boolean[n];
        boolean[] diagonals = new boolean[2*n - 1];
        boolean[] rDiagonals = new boolean[2*n -1];

        nQueenPossiblePlaces(board, 0, columns, diagonals, rDiagonals, "");
        
    }
}
