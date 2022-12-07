public class Rec_MaxNumWithMinSwaps {
    public static void main(String[] args) {
        String strNum = "19375638";
        int k = 4;
        max = strNum;
        maxNum(strNum, k);
        System.out.println();
        System.out.println("The maximum number that can be made: " + max);
        System.out.println();
    }

    static String max;

    public static void maxNum(String strNum, int k){

        if(Integer.parseInt(max) < Integer.parseInt(strNum)){
            max = strNum;
        }

        if(k == 0){
            return;
        }

        for(int i = 0; i<strNum.length() - 1; i++){
            for(int j = i+1; j<strNum.length(); j++){
                if(strNum.charAt(j) > strNum.charAt(i)){
                    strNum = swap(strNum, i, j);
                    maxNum(strNum, k - 1);
                    strNum = swap(strNum, i, j); //backtracking
                }
            }
        }
    }

    public static String swap(String strNum, int i , int j){
        char ith = strNum.charAt(i);
        char jth = strNum.charAt(j);
        String left = strNum.substring(0, i);
        String mid = strNum.substring(i+1, j);

        String right = strNum.substring(j+1);
        
        return left + jth + mid + ith + right;

    }

}
