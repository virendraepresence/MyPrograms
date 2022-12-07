import java.util.ArrayList;
public class recursion17 {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();

        allSubsets(n, subset);
        // printSubSet(subset);
    }

    public static void allSubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            printSubSet(subset);
            return;
        }

        subset.add(n);
        allSubsets(n-1, subset);

        subset.remove(subset.size() -1);
        allSubsets(n-1, subset);

    }

    public static void printSubSet(ArrayList<Integer> subset){
        for(int element : subset){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
