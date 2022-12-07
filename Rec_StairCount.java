import java.util.*;
public class Rec_StairCount {
    public static void main(String[] args) {
        int n = 4;

        ArrayList<String> list = pathCount(n);
        System.out.println(list.size());
        for(String s: list){
            System.out.print(s + ", ");
        }
    }

    public static ArrayList<String> pathCount(int n){
        if(n==0){
            ArrayList<String> list0 = new ArrayList<>();
            list0.add("");
            return list0;
        }

        if(n<0){
            ArrayList<String> listNegatives = new ArrayList<>();
            return listNegatives;
        }

        ArrayList<String> path1 = pathCount(n-1);
        ArrayList<String> path2 = pathCount(n-2);
        ArrayList<String> path3 = pathCount(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for(String path: path1){
            paths.add(1+ path);
        }
        for(String path: path2){
            paths.add(2+ path);
        }
        for(String path: path3){
            paths.add(3+ path);
        }

        return paths;

    }
}
