public class recursion4 {
    public static void main (String[] args) throws java.lang.Exception{
        int n = 3;
        
        towerOfHanoi(n, "S", "H", "D");
        System.out.println("AND");
        System.out.println("Number of Steps Required: " + count);

    }
    static int count = 0;
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            count++;
            
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        count++;
        towerOfHanoi(n-1, src, dest, helper);
    }
}
