public class recursion_1 {
    public static void main (String[] args) throws java.lang.Exception
	{
        System.out.println(factorial(5));
        System.out.println(factorial2(5));
    }


    public static int factorial2(int n){

        if(n==0 || n ==1){
            return 1;
        }

        for(int i = n-1; i>0; i--){
            n = n * i;
        }
        return n;
        
    }
    public static int factorial(int n){
        if(n==0 || n ==1){
            return 1;
        }

        int fact = n*factorial(n-1);
        return fact;
    }
        


}
