import java.beans.DesignMode;
import java.util.*;
public class Rec_MazePathWithJumps {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<String> ansList = mazePathsWithJumps(1, 1, 3, 3);
        System.out.println(ansList.size());
        for(String s: ansList){
            System.out.print(s + ", ");
        }
        

    }

    public static ArrayList<String> mazePathsWithJumps(int sourceRow, int sourceColumn, int destiRow, int destiColumn){
        if(sourceRow == destiRow && destiColumn == sourceColumn){
            ArrayList<String> listE = new ArrayList<>();
            listE.add("");
            return listE;
        }

        ArrayList<String> paths = new ArrayList<>();

        

        for(int moveSize = 1; moveSize <= destiColumn - sourceColumn; moveSize++){
            ArrayList<String> pathH = new ArrayList<>();
            pathH = mazePathsWithJumps(sourceRow, sourceColumn + moveSize, destiRow, destiColumn);
            for(String path : pathH){
                paths.add("h" + moveSize + path);
            }
        }

        for(int moveSize = 1; moveSize <= destiRow - sourceRow; moveSize++){
            ArrayList<String> pathV = new ArrayList<>();
            pathV = mazePathsWithJumps(sourceRow + moveSize, sourceColumn, destiRow, destiColumn);
            for(String path : pathV){
                paths.add("v" + moveSize + path);
            }
        }

        for(int moveSize = 1; moveSize <= destiRow - sourceRow && moveSize <= destiColumn - sourceColumn; moveSize++){
            ArrayList<String> pathD = new ArrayList<>();
            pathD = mazePathsWithJumps(sourceRow + moveSize, sourceColumn + moveSize, destiRow, destiColumn);
            for(String path : pathD){
                paths.add("d" + moveSize + path);
            }
        }
        
        return paths;
    }
}
