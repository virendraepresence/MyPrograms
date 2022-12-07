import javax.swing.text.html.parser.ParserDelegator;

public class Rec_Palindromic_subStrings {
    public static void main(String[] args) {
        String str = "abaaba";
        palindromicSubStrings(str, "");

    }

    public static void palindromicSubStrings(String str, String answerSoFar){
        if(str.length() == 0){
            System.out.println(answerSoFar);
            return;
        }

        for(int i = 0; i<str.length(); i++){
            String prefixSub = str.substring(0, i+1);
            String ros = str.substring(i+1);
            if(isPalindrome(prefixSub)){
                palindromicSubStrings(ros, answerSoFar + "(" + prefixSub + ")");
            }
            
        }
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
