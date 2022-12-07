public class Recursion07 {
    public static void main (String[] args)  throws java.lang.Exception{
        int[] arr = {1 , 2, 3, 3, 5};

        System.out.println(isSorted(arr, 0));
        


    }

    public static boolean isSorted(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] >= arr[idx+1]){
            return false;
        }
            
        return isSorted(arr, idx+1);
        
    }
}
