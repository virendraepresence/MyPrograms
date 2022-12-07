public class DP_CountBinaryString {
    public static void main(String[] args) {
        int noOfDigits = 6;

        int oldZeroesCount = 1;
        int oldOnesCount = 1;

        for(int i = 2; i<=noOfDigits; i++){
            int newZeroesCount = oldOnesCount;
            int newOnesCount = oldZeroesCount + oldOnesCount;

            oldZeroesCount = newZeroesCount;
            oldOnesCount = newOnesCount;
        }


        System.out.println(oldOnesCount + oldZeroesCount);
    }

}
