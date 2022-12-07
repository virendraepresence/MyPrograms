public class recursion15 {
    public static void main(String[] args) {
        int n = 4, m = 53;

        System.out.println(placeTiles(n, m));
    }

    public static int placeTiles(int n, int m){
        //base cases
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }

        
        int vertPlacements = placeTiles(n-m, m);

        int horiPlacements = placeTiles(n-1, m);

        return vertPlacements + horiPlacements;
        
    }
}
