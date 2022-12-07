import java.util.*;
public class Rec_KeyPadComb {
    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKeyPadCombination(String str){
        if(str.length() == 0){
            ArrayList<String> list1 = new ArrayList<String>();
            list1.add("");
            return list1;
        }

        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> recursionResult = getKeyPadCombination(restOfString);

        ArrayList<String> myResult = new ArrayList<>();
        String code = codes[ch - '0'];
        for(int i=0; i<code.length(); i++){
            char charCode = code.charAt(i);
            for(String s: recursionResult){
                myResult.add(charCode + s);
            }
        }

        return myResult;
    }
    public static void main(String[] args) {
        String str = "678";
        ArrayList<String> answerList = getKeyPadCombination(str);
        for(String s : answerList){
            System.out.print(s +", ");
        }   
    }
}
