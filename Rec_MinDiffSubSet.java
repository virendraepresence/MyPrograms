import java.util.*;
public class Rec_MinDiffSubSet {
    static int minDiff = Integer.MAX_VALUE;
    static String answer = "";
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4,6};
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        minDiffSubSets(arr, 0, set1, set2, 0, 0);
        System.out.println(answer);
        System.out.println("And the difference is: " + minDiff);

    }

    public static void minDiffSubSets(int[] arr, int idx, ArrayList<Integer> set1, ArrayList<Integer> set2, int sumOfSet1, int sumOfSet2){
        if(idx == arr.length){
            int diff = Math.abs(sumOfSet1 - sumOfSet2);
            if(diff < minDiff){
                minDiff = diff;
                answer = "Set1: " + set1 + ", Set2: " + set2;
            }
            return;
        }
        if(set1.size() < (arr.length + 1) / 2){
            set1.add(arr[idx]);
            minDiffSubSets(arr, idx+1, set1, set2, sumOfSet1 + arr[idx], sumOfSet2);
            set1.remove(set1.size() -1);
        }else if(set2.size() < (arr.length + 1) / 2){
            set2.add(arr[idx]);
            minDiffSubSets(arr, idx+1, set1, set2, sumOfSet1, sumOfSet2 + arr[idx]);
            set2.remove(set2.size() -1);  
        }

    }
}
