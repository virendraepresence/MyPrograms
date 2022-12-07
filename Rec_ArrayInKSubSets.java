import java.util.*;
public class Rec_ArrayInKSubSets {
    public static void main(String[] args) {
        int n = 3;
        int k = 2;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i= 0; i<k; i++){
            list.add(new ArrayList<>());
        }
        toKSubSets(n, k, 1, 0, list);
    }
    static int counter = 0;

    public static void toKSubSets(int n, int k, int i, int noOfSets, ArrayList<ArrayList<Integer>> list){
        if(i > n){
            if(noOfSets == k){
                counter++;
                System.out.print(counter + ": ");
                for(ArrayList<Integer> childList : list){

                    System.out.print(childList + " ");
                }

                System.out.println();
            }
            return;
        }

        for(int j = 0; j<list.size(); j++){
            if(list.get(j).size() > 0){
                list.get(j).add(i);
                toKSubSets(n, k, i+1, noOfSets, list);
                list.get(j).remove(list.get(j).size() -1);
            }else{
                list.get(j).add(i);
                toKSubSets(n, k, i+1, noOfSets+1, list);
                list.get(j).remove(list.get(j).size() -1);
                break;
            }
        }
    }
}
