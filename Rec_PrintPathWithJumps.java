public class Rec_PrintPathWithJumps {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
        int n = arr.length;
        int m = arr[0].length;
        printMazePathsWithJumps(1, 1, n, m, "");
    }

    public static void printMazePathsWithJumps(int sourceRow, int sourceColumn, int destiRow, int destiColumn, String ans){
        if(sourceRow == destiRow && destiColumn == sourceColumn){
            System.out.println(ans);
            return;
        }

        for(int moveSize = 1; moveSize <= destiColumn - sourceColumn; moveSize++){
            printMazePathsWithJumps(sourceRow, sourceColumn + moveSize, destiRow, destiColumn, ans + "h" + moveSize);
        }

        for(int moveSize = 1; moveSize <= destiRow - sourceRow; moveSize++){
            printMazePathsWithJumps(sourceRow + moveSize, sourceColumn, destiRow, destiColumn, ans + "v" + moveSize);
        
        }

        for(int moveSize = 1; moveSize <= destiRow - sourceRow && moveSize <= destiColumn - sourceColumn; moveSize++){
            printMazePathsWithJumps(sourceRow + moveSize, sourceColumn + moveSize, destiRow, destiColumn, ans + "d" + moveSize);
        }
        
    }
}
