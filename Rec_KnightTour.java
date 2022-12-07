public class Rec_KnightTour {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        int[][] chess = new int[n][m];
        knightTour(chess, 2, 3, 1);

    }

    public static void knightTour(int[][] chess, int row, int col, int move){
        if(row< 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0){
            return;
        }else if(move == chess.length * chess.length){
            chess[row][col] = move;
            displayKnightTour(chess);
            chess[row][col] = 0;
            return;
        }

        chess[row][col] = move;
        knightTour(chess, row-2, col+1, move+1);
        knightTour(chess, row-1, col+2, move+1);
        knightTour(chess, row+1, col+2, move+1);
        knightTour(chess, row+2, col+1, move+1);
        knightTour(chess, row+2, col-1, move+1);
        knightTour(chess, row+1, col-2, move+1);
        knightTour(chess, row-1, col-2, move+1);
        knightTour(chess, row-2, col-1, move+1);
        chess[row][col] = 0;
        
    }

    public static void displayKnightTour(int[][] chess){
        for(int i = 0; i<chess.length; i++){
            for(int j = 0; j<chess[0].length; j++){
                System.out.print(chess[i][j] + " "); 
            }
            System.out.println();
        }
        System.out.println();
    }
}
