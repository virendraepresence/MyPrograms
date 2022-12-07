import java.util.*;
public class Rec_StringSubSeqList {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> answerList = findSubSeq(str);
        for(String i : answerList){
            System.out.print(i+" ");
        }
    }

    public static ArrayList<String> findSubSeq(String str){
        if(str.length() == 0){
            ArrayList<String> list1 = new ArrayList<String>();
            list1.add("");
            return list1;
        }

        char ch = str.charAt(0);
        String restOfString = str.substring(1);
        ArrayList<String> recursionResult = findSubSeq(restOfString);

        ArrayList<String> myResult = new ArrayList<>();

        for(String s: recursionResult){
            myResult.add("" + s);
        }
        for(String s: recursionResult){
            myResult.add(ch + s);
        }

        return myResult;
        
    }
}
