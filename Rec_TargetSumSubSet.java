public class Rec_TargetSumSubSet {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 70;

        targetSumSubset(arr, 0, "", 0, target);

    }

    public static void targetSumSubset(int[] arr, int idx, String set, int sumOfSet, int target){
        if(idx == arr.length -1){
            if(sumOfSet == target)
                System.out.println(set + ".");
            return;
        }

        targetSumSubset(arr, idx + 1, set + arr[idx] + ", ", sumOfSet + arr[idx], target);
        targetSumSubset(arr, idx + 1, set, sumOfSet, target);
    }
}
