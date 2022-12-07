public class recursion3 {
    public static void main (String[] args) throws java.lang.Exception{
        int n = 5;
        int x = 3;

        int result = printXpowerN2(x, n);
        System.out.println(result);
        

    }

    public static int printXpowerN2(int x, int n){
        if(n == 0){

            return 1;
        }
        if(x == 0){

            return 0;
        }

        if(n%2 == 0){
            return printXpowerN2(x, n/2) * printXpowerN2(x, n/2);

        }else{
            return printXpowerN2(x, n/2) * printXpowerN2(x, n/2) * x;

        }

    }

    public static int printXpowerN(int x, int n){
        if(n == 0){

            return 1;
        }
        if(x == 0){

            return 0;
        }

        int res = x * printXpowerN(x, n-1);

        return res;
    }
}
