public class recursion16 {
    public static void main(String[] args) {
        int n = 4;
        int totalWays = callTheGuest(n);
        System.out.println(totalWays);
    }

    public static int callTheGuest(int n){
        if(n <= 1){
            return 1;
        }

        int ways1 = callTheGuest(n-1);
        int ways2 = (n-1) * callTheGuest(n-2);
        return ways1 + ways2;
    }
}
