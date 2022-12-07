import java.util.*;
public class Rec_kLengthWords2 {
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

        kCharsFromWord2(1, k, new HashSet<>(), uniqueString, "");
    }

    public static void kCharsFromWord2(int currItem, int k, HashSet<Character> set, String uniqueString, String answerSoFar){
        if(currItem > k){
            System.out.println(answerSoFar);
            return;
        }

        
        for(int i = 0; i<uniqueString.length(); i++){
            char ch = uniqueString.charAt(i);
            if(set.contains(ch) == false){
                set.add(ch);
                kCharsFromWord2(currItem+1, k, set, uniqueString, answerSoFar+ch);
                set.remove(ch);
            }
        }
    }
}
