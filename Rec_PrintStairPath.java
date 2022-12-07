import java.util.*;
public class Rec_PrintStairPath {
    public static void printStairCount(int n, String ans){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.print(ans + " ");
            return;
        }

        printStairCount(n-1, ans + 1);
        printStairCount(n-2, ans + 2);
        printStairCount(n-3, ans + 3);

    
    }

    public static void main(String[] args) {
        int n = 4;
        printStairCount(n, "");
        // System.out.println();
        // System.out.println(count);
        
    }
}
