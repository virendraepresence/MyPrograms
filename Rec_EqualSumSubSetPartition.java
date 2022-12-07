import java.util.*;
public class Rec_EqualSumSubSetPartition {
    public static void main(String[] args) {
       
        int k = 3;
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        // if k == 1, the whole arr is the answer
        if(k == 1){
            System.out.print("[");
            for(int i = 0; i<arr.length; i++){
                System.out.println(arr[i] + ", ");
            }
            System.out.print("]");
            return;
        }



        if( k > n || sum % k != 0 || k == 0){
            System.out.println("-1");
            return;
        }
        int[] subSetSum = new int[k];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i<k; i++){
            list.add(new ArrayList<>());
        }

        // System.out.println("Yaha pahuch raha hai, lin 34 pe");
        printEqualSubSetPartitions(arr, n, k, 0, subSetSum, 0, list);

    }

    public static void printEqualSubSetPartitions(int[] arr, int n, int k, int idx, int[] subSetSum, int filledSubSets, ArrayList<ArrayList<Integer>> list){
        if(idx == arr.length){
            
            if(filledSubSets == k){
                boolean flag = true;
                for(int i = 0; i<subSetSum.length -1; i++){
                    if(subSetSum[i] != subSetSum[i+1]){
                        flag = false;
                        break;
                    }
                }

                if(flag == true){
                    System.out.println("Yaha pahuch raha hai, lin 52 pe");
                    for(ArrayList<Integer> partition: list){
                        System.out.print(partition + " ");
                    }
                    System.out.println();
                }
                
            }
            return;
            
        }

        // System.out.println("Yaha pahuch raha hai, lin 59 pe");
        for(int i = 0; i < list.size(); i++){
            // System.out.println("Yaha pahuch raha hai, lin 61 pe");
            if(list.get(i).size() > 0){
                list.get(i).add(arr[idx]);
                subSetSum[i] += arr[idx];
                printEqualSubSetPartitions(arr, n, k, idx + 1, subSetSum, filledSubSets, list);
                subSetSum[i] -= arr[idx];
                list.get(i).remove(list.get(i).size() - 1);
            }else{
                list.get(i).add(arr[idx]);
                subSetSum[i] += arr[idx];
                printEqualSubSetPartitions(arr, n, k, idx + 1, subSetSum, filledSubSets + 1, list);
                subSetSum[i] -= arr[idx];
                list.get(i).remove(list.get(i).size() - 1);
                break;
            }
        }
    }
}
