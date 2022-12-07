import java.util.*;
public class Rec_wordBreak {
    public static void main(String[] args) {
        String str = "microsoftishiring";
        String[] arr = {"micro", "soft", "is", "hi", "ring", "hiring", "microsoft"};
        HashSet<String> dict = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            dict.add(arr[i]);
        }

        wordBreak(str, "", dict);
    }

    public static void wordBreak(String str, String answerSoFar, HashSet<String> dict){
        if(str.length() == 0){
            System.out.println(answerSoFar);
            return;
        }

        for(int i = 0; i<str.length(); i++){
            String left = str.substring(0, i+1);
            if(dict.contains(left)){
                String right = str.substring(i + 1);
                wordBreak(right, answerSoFar + " " + left, dict);
            }
        }
    }
}
