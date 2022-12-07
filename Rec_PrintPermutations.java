public class Rec_PrintPermutations {
    public static void main(String[] args) {
        int n = 4;
        int r = 4;

        printPermutaions(new int[n], 1, r);

    }

    public static void printPermutaions(int[] arr, int currentItem, int totalItems){
        if(currentItem > totalItems){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[i] = currentItem;
                printPermutaions(arr, currentItem + 1, totalItems);
                arr[i] = 0;
            }
        }
    }
}