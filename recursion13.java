public class recursion13 {
    public static void main(String[] args) {
        String str = "abc";

        allCombination(str, "");
    }

    public static void allCombination(String str, String permutation){
        //base case
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }

        

        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);

            // "abc" -> "ac"
            String newStr = str.substring(0, i) + str.substring(i+1);
            allCombination(newStr, permutation+currChar);

        }

        



    }
}
