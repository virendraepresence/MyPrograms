public class Rec_WordPuzzle {
    public static void main(String[] args) {
        char[][] arr = {{'+','-','+'},
                        {'-','-','-'},
                        {'+','-','+'},};
        
        String[] words = {"and", "ant"};
        
        solution(arr, words, 0);
    }

    public static void solution(char[][] arr, String[] words, int wordIndex){
        if(wordIndex == words.length){
            displayBoard(arr);
            return;
        }
        String word = words[wordIndex];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == '-' || arr[i][j] == word.charAt(0)){
                    if(canPlaceTheWordHorizontally(arr, i, j, word) == true){
                        boolean[] wePlaced = placeTheWordHorizontally(arr, i, j, word);
                        solution(arr, words, wordIndex+1);
                        unPlaceTheWordHorizontally(arr, i, j, wePlaced);
                    }

                    if(canPlaceTheWordVertically(arr, i, j, word) == true){
                        boolean[] wePlaced = placeTheWordVertically(arr, i, j, word);
                        solution(arr, words, wordIndex+1);
                        unPlaceTheWordVertically(arr, i, j, wePlaced);
                    }
                }
            }
            
        }
    }

    public static boolean canPlaceTheWordHorizontally(char[][] arr, int i, int j, String word){
        if(j-1>=0 && arr[i][j-1] != '+'){
            return false;
        }else if(j + word.length() < arr[0].length && arr[i][j+word.length()] != '+'){
            return false;
        }

        for(int jj = 0; jj<word.length(); jj++){
            if((j+jj) > arr[0].length){
                return false;
            }
            if(arr[i][j+jj] == '-' || arr[i][j+jj] == word.charAt(jj)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean canPlaceTheWordVertically(char[][] arr, int i, int j, String word){
        if(i-1>=0 && arr[i-1][j] != '+'){
            return false;
        }else if(i + word.length() < arr.length && arr[i+word.length()][j] != '+'){
            return false;
        }

        for(int ii = 0; ii<word.length(); ii++){
            if((i+ii) > arr.length){
                return false;
            }
            if(arr[i+ii][j] == '-' || arr[i+ii][j] == word.charAt(ii)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static boolean[] placeTheWordHorizontally(char[][] arr, int i, int j, String word){
        boolean[] wePlaced = new boolean[word.length()];

        for(int jj = 0; jj<arr[0].length; jj++){
            if(arr[i][j+jj] == '-'){
                arr[i][j+jj] = word.charAt(jj);
                wePlaced[jj] = true;
            }
        }

        return wePlaced;
    }

    public static boolean[] placeTheWordVertically(char[][] arr, int i, int j, String word){
        boolean[] wePlaced = new boolean[word.length()];

        for(int ii = 0; ii<arr[0].length; ii++){
            if(arr[i+ii][j] == '-'){
                arr[i+ii][j] = word.charAt(ii);
                wePlaced[ii] = true;
            }
        }
        return wePlaced;
    }

    public static void unPlaceTheWordHorizontally(char[][] arr, int i, int j, boolean[]  wePlaced){
        for(int jj = 0; jj<wePlaced.length; jj++){
            if(wePlaced[jj] == true){
                arr[i][j+jj] = '-';
            }
        }
    }

    public static void unPlaceTheWordVertically(char[][] arr, int i, int j, boolean[]  wePlaced){
        for(int ii = 0; ii<wePlaced.length; ii++){
            if(wePlaced[ii] == true){
                arr[i+ii][j] = '-';
            }
        }
    }
    
    public static void displayBoard(char[][] board){
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
