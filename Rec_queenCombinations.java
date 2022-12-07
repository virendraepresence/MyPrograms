import javax.management.QueryEval;

public class Rec_queenCombinations {
    public static void main(String[] args) {
        int queens = 2;
        placeQueens(0, queens, 0, 0, "");
    }

    public static void placeQueens(int queenPlacedSoFar, int queens, int row, int col, String answerSoFar){
        if(row == queens){
            if(queenPlacedSoFar == queens){
                System.out.println(answerSoFar);
            }
            // System.out.println();
            return;
        }

        int newRow = 0;
        int newCol = 0;
        String yesAnswerSoFar = "";
        String noAnswerSoFar = "";

        if(col == queens - 1){
            newRow = row + 1;
            newCol = 0;
            yesAnswerSoFar = yesAnswerSoFar + "q\n";
            noAnswerSoFar = noAnswerSoFar + "-\n";
        }else{
            newRow = row;
            newCol = col + 1;
            yesAnswerSoFar = yesAnswerSoFar + "q";
            noAnswerSoFar = noAnswerSoFar + "-";
        }

        placeQueens(queenPlacedSoFar+1, queens, newRow, newCol, yesAnswerSoFar);
        placeQueens(queenPlacedSoFar, queens, newRow, newCol, noAnswerSoFar);
    }
}
