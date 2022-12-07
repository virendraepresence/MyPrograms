import java.util.*;
public class Rec_PrintMazePath {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
        int n = arr.length;
        int m = arr[0].length;
        printMazePaths(1, 1, n, m, "");
        
        

    }

    public static void printMazePaths(int sourceRow, int sourceColumn, int destiRow, int destiColumn, String ans){
        // if(sourceRow>destiRow || sourceColumn>destiColumn){
        //     return;
        // }
        if(sourceRow == destiRow && destiColumn == sourceColumn){
            System.out.println(ans);
            return;
        }



        if(sourceRow < destiRow){
            printMazePaths(sourceRow + 1, sourceColumn, destiRow, destiColumn, ans + "h");
        }
        if(sourceColumn < destiColumn){
            printMazePaths(sourceRow, sourceColumn + 1, destiRow, destiColumn, ans + "v");
        }
        
    }
}
