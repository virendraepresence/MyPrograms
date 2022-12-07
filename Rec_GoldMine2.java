import java.util.*;
public class Rec_GoldMine2 {
    static int max = 0;
    public static void main(String[] args) {
        int[][] arr = {{0,6,0},{5,8,7},{0,9,0}};
        getMaxGold(arr);
        System.out.println(max);
    }

    public static int getMaxGold(int[][] arr){
        boolean[][] visited = new boolean[arr.length][arr[0].length];
        // int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                ArrayList<Integer> bag = new ArrayList<>();
                travelAndCollectGold(arr, i, j, visited, bag);


                int sum = 0;
                for(int val:bag){
                    sum += val;
                }

                if(sum > max){
                    max = sum;
                }


            }

            
        }

        return 0;
    }

    public static void travelAndCollectGold(int[][] arr, int i, int j, boolean[][] visited, ArrayList<Integer> bag){
        if(i<0 || j<0 || i>=arr.length|| j>=arr[0].length || arr[i][j] == 0 || visited[i][j] == true){
            return;
        }

        visited[i][j] = true;
        bag.add(arr[i][j]);
        travelAndCollectGold(arr, i-1, j, visited, bag);
        travelAndCollectGold(arr, i, j+1, visited, bag);
        travelAndCollectGold(arr, i, j-1, visited, bag);
        travelAndCollectGold(arr, i+1, j, visited, bag);
    }
}
