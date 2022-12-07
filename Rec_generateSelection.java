import java.util.*;
public class Rec_generateSelection {
    public static void main(String[] args) {
        String str = "abbbccdde";
        int k = 3;
        HashSet<Character> uniqueSet = new HashSet<>();
        String uniqueString = "";
        for(char ch : str.toCharArray()){
            if(uniqueSet.contains(ch) == false){
                uniqueSet.add(ch);
                uniqueString += ch;
            }
        }

        // System.out.println(uniqueString);

        generateSelection(0, -1, k, "", uniqueString);
    }

    public static void generateSelection(int currItem, int lastItem, int k, String answerSoFar, String uniqueString){
        if(currItem == k){
            System.out.println(answerSoFar);
            return;
        }

        for(int i = lastItem + 1; i<uniqueString.length(); i++){
            char ch = uniqueString.charAt(i);
            generateSelection(currItem+1, i, k, answerSoFar+ch, uniqueString);
        }
    }
}
