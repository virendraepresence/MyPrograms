public class Rec_Combinations {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        //We are trying to find nCr, combinations for n boxes and r items
        printCombinations(n, 0, r, 0, "");
    }

    public static void printCombinations(int n, int currIndex, int r, int selectionSoFar, String answerSoFar){
        if(currIndex == n){
            if(selectionSoFar == r){
                System.out.println(answerSoFar);
            }
            return;
        }

        printCombinations(n, currIndex+1, r, selectionSoFar, answerSoFar+1);
        printCombinations(n, currIndex+1, r, selectionSoFar+1, answerSoFar+"-");
    }
}
