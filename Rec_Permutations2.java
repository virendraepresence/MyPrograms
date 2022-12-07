public class Rec_Permutations2 {
    public static void main(String[] args) {
        int n = 5;
        int r = 3;

        printPermutaions2(n, 1, new int[r], 0, "");
    }

    public static void printPermutaions2(int n, int currentIndex, int[] rItems, int selectionSoFar, String answerSoFar){
        if(currentIndex > n){
            if(selectionSoFar == rItems.length){
                System.out.println(answerSoFar);
            }
            return;
        }

        for(int i = 0; i<rItems.length; i++){
            if(rItems[i] == 0){
                rItems[i] = 1;
                printPermutaions2(n, currentIndex+1, rItems, selectionSoFar+1, answerSoFar+(i+1));
                rItems[i] = 0;
            }
        }

        printPermutaions2(n, currentIndex+1, rItems, selectionSoFar, answerSoFar+0);
    }
}
