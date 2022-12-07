import java.util.*;
public class Rec_PringKeyPadSubSeq {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    static int count = 0;
    public static void printKeyPadCombination(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            count++;
            return;
        }

        char ch = str.charAt(0);
        String restOfString = str.substring(1);

        String code = codes[ch - '0'];
        for(int i=0; i<code.length(); i++){
            char charCodeOption = code.charAt(i);
            printKeyPadCombination(restOfString, charCodeOption + ans);
        }
    
    }

    public static void main(String[] args) {
        String str = "678";
        
        printKeyPadCombination(str, "");
        System.out.println();
        System.out.println(count);
        
    }
}
