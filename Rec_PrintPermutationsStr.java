public class Rec_PrintPermutationsStr {
    public static void main(String[] args) {
        String str = "1234";
        printPermutationsStr(str, "");
    }

    public static void printPermutationsStr(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            String restOfString = str.substring(0, i) + str.substring(i+1);

            printPermutationsStr(restOfString, ans + ch);
    
        }
        
    }
}
