import java.lang.reflect.AnnotatedArrayType;

public class Rec_findAllIndexofN {
    public static void main(String[] args) {
        int[] arr = {5,1,4,8,3,5,1,4,6,8,4,2};
        int data = 4;
        
        int[] answer = findIndices(arr, data, 0, 0);
        for(int indices : answer){
            System.out.print(indices + " ");
        }


    }

    public static int[] findIndices(int[] arr, int data, int idx, int foundSoFar){
        if(idx == arr.length){
            return new int[foundSoFar];
        }

        if(arr[idx] == data){
            int[] temp = findIndices(arr, data, idx+1, foundSoFar + 1);
            temp[foundSoFar] = idx;
            return temp;
        }else{
            int[] temp = findIndices(arr, data, idx+1, foundSoFar);
            return temp;
        }
    }       
}
