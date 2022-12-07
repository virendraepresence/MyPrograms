public class Rec_FloodFill {
    public static void main(String[] args) {
        int[][] arr = {{0,1,1},
                      {0,0,1}, 
                      {1,0,0},
                      {0,1,0}};
        int n = arr.length;
        int m = arr[0].length;
        boolean[][] visited = new boolean[n][m];
        mazeFloodFill(arr, 0, 0, "", visited);
        
    }

    public static void mazeFloodFill(int[][] maze, int row, int col, String pathSoFar, boolean[][] visited){
        if(row < 0 || col < 0 || row == maze.length || col == maze[0].length 
        || maze[row][col] == 1 || visited[row][col] == true){
            return;
        }

        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(pathSoFar);
            return;
        }

        visited[row][col] = true;
        mazeFloodFill(maze, row-1, col, pathSoFar + "t", visited);
        mazeFloodFill(maze, row, col-1, pathSoFar + "l", visited);
        mazeFloodFill(maze, row+1, col, pathSoFar + "d", visited);
        mazeFloodFill(maze, row, col+1, pathSoFar + "r", visited);
        visited[row][col] = false;
    }
}
