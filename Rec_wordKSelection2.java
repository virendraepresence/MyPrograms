import java.util.*;
public class Rec_wordKSelection2 {
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
        Character[] charArr = new Character[k];

        kUniqueFormation(0,0, k, uniqueString, charArr);
    }

    public static void kUniqueFormation(int currItem, int selectionSoFar, int k, String uniqueString, Character[] charArr){
        if(currItem == uniqueString.length()){
            if(selectionSoFar == k){
                for(char ch : charArr){
                    System.out.print(ch);
                }
                System.out.println();
            }
            return;
        }
        char ch = uniqueString.charAt(currItem);
        for(int i = 0; i<charArr.length; i++){
            if(charArr[i] == null){
                charArr[i] = ch;
                kUniqueFormation(currItem + 1, selectionSoFar + 1, k, uniqueString, charArr);
                charArr[i] = null;

            }
        }

        kUniqueFormation(currItem+1, selectionSoFar, k, uniqueString, charArr);
    }
}
