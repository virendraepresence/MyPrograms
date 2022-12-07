public class Rec_NQueens {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int[][] chess = new int[n][m];
        nQueensPossiblePlaces(chess, "", 0);

    }

    public static void nQueensPossiblePlaces(int[][] chess, String queenSoFar, int row){
        if(row == chess.length){
            System.out.println(queenSoFar + ".");
            return;
        }

        for(int col = 0; col<chess[0].length; col++){
            if(isItASafePlace(chess, row, col) ==  true){
                chess[row][col] = 1;
                nQueensPossiblePlaces(chess, queenSoFar + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
            }
        } 
    }

    public static boolean isItASafePlace(int[][] chess, int row, int col){
        for(int i = row-1, j = col; i>=0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row-1, j = col-1; i>=0 && j>=0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row-1, j = col+1; i>=0 && j<chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }

        return true;
    }
}
