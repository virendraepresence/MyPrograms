import java.util.*;
public class Rec_MazePaths {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {1,2,3}, {1,2,3}};
        int n = arr.length;
        int m = arr[0].length;
        ArrayList<String> ansList = mazePaths(1, 1, n, m);
        System.out.println(ansList.size());
        for(String s: ansList){
            System.out.print(s + ", ");
        }
    }

    public static ArrayList<String> mazePaths(int sourceRow, int sourceColumn, int destiRow, int destiColumn){
        if(sourceRow == destiRow && destiColumn == sourceColumn){
            ArrayList<String> listE = new ArrayList<>();
            listE.add("");
            return listE;
        }

        ArrayList<String> pathV = new ArrayList<>();
        ArrayList<String> pathH = new ArrayList<>();

        if(sourceRow < destiRow){
            pathV = mazePaths(sourceRow + 1, sourceColumn, destiRow, destiColumn);
        }
        if(sourceColumn < destiColumn){
            pathH = mazePaths(sourceRow, sourceColumn + 1, destiRow, destiColumn);
        }
        
        ArrayList<String> paths = new ArrayList<>();
        for(String path : pathH){
            paths.add("h" + path);
        }

        for(String path : pathV){
            paths.add("v" + path);
        }
        return paths;
    }
}
