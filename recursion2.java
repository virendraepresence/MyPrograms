public class recursion2 {
    public static void main (String[] args) throws java.lang.Exception{

        int n = 7;
        
        int oldNum = 0;
        int currNum = 1;

        

        System.out.println(oldNum + " ");
        System.out.println(currNum + " ");

        // fibonacci2(n-2, 0, 1);

        fibonacci(n-2, 0, 1);

    }

    public static void fibonacci(int n, int oldNum, int currNum){
        if(n==0){
            // System.out.print(1);
            return;
        }

        int fib = oldNum + currNum;
        System.out.println(fib);
        fibonacci(n-1, currNum, fib);
        return;


    }
// 1 1 2 3 5 8 13 21 34
    public static void fibonacci2(int n, int oldNum, int currNum){
        if(n==0 || n == 1){
            System.out.print(1);
            return;
        }

        
        
        for(int i = 1; i<n; i++){
            
            int fib = oldNum + currNum;
            System.out.print(fib + " ");
            oldNum = currNum;
            currNum = fib;
        }
    }
    
}
