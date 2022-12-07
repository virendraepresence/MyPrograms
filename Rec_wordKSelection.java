import java.util.*;
public class Rec_wordKSelection {
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

        kCharsFromWord(0, 0, k, "", uniqueString);
    }

    public static void kCharsFromWord(int currIndex, int selectionSoFar, int k, String answerSoFar, String uniqueString){
        if(currIndex == uniqueString.length()){
            if(selectionSoFar == k){
                System.out.println(answerSoFar);
            }
            return;
        }

        char ch = uniqueString.charAt(currIndex);

        kCharsFromWord(currIndex + 1, selectionSoFar + 1, k, answerSoFar + ch, uniqueString);
        kCharsFromWord(currIndex + 1, selectionSoFar, k, answerSoFar, uniqueString);
    }
}
