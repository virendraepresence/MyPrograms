public class Rec_SuDoKuSolve {
    public static void main(String[] args) {
        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                        {5, 2, 0, 0, 0, 0, 0, 0, 0},
                        {0, 8, 7, 0, 0, 0, 0, 3, 1},
                        {0, 0, 3, 0, 1, 0, 0, 8, 0},
                        {9, 0, 0, 8, 6, 3, 0, 0, 5},
                        {0, 5, 0, 0, 9, 0, 6, 0, 0}, 
                        {1, 3, 0, 0, 0, 0, 2, 5, 0},
                        {0, 0, 0, 0, 0, 0, 0, 7, 4},
                        {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        suDoKuSolution(board, 0, 0);
        
    }

    public static void suDoKuSolution(int[][] board, int i, int j){
        if(i == board.length){
            displayBoard(board);
            return;
        }  
        int newI = 0;
        int newJ = 0;

        if(j == board[0].length - 1){
            newI = i+1;
            newJ = 0;
        }else{
            newI = i;
            newJ = j + 1;
        }

        if(board[i][j] != 0){
            suDoKuSolution(board, newI, newJ);
        }else{
            for(int posibleOption = 1; posibleOption<=9; posibleOption++){
                if(isValid(board, i, j, posibleOption) == true){
                    board[i][j] = posibleOption;
                    suDoKuSolution(board, newI, newJ);
                    board[i][j] = 0;
                }
            }
        }
        

    }

    public static boolean isValid(int[][] board, int x, int y, int val){
       

        for(int j = 0; j<board[0].length; j++){
            if(board[x][j] == val){
                return false;
            }
        }

        for(int i = 0; i<board.length; i++){
            if(board[i][y] == val){
                return false;
            }
        }

        int subMatrixI = x/3 * 3;
        int subMatrixJ = y/3 * 3;

        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[subMatrixI + i][subMatrixJ + j] == val){
                    return false;
                }
            }
        }

        return true;
    }

    public static void displayBoard(int[][] board){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}