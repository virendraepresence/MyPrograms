import java.util.*;
public class Rec_wordPermutations2 {
    public static void main(String[] args) {
        String str = "aabb";

        HashMap<Character, Integer> lastOccurance = new HashMap<>();

        for(char ch : str.toCharArray()){
            lastOccurance.put(ch, -1);
        }

        Character[] charArr = new Character[str.length()];

        wordPermutations2(lastOccurance, str, charArr, 0);

    }

    public static void wordPermutations2(HashMap<Character, Integer> lastOccurance, String str, Character[] charArr, int currCharacter){
        if(currCharacter == str.length()){
            for(int i = 0; i<charArr.length; i++){
                System.out.print(charArr[i]);
            }
            System.out.println();
            return;
        }

        char ch = str.charAt(currCharacter);
        int lastOccur = lastOccurance.get(ch);

        for(int i = lastOccur + 1; i<str.length(); i++){
            if(charArr[i] == null){
                charArr[i] = ch;
                lastOccurance.put(ch, i);
                
                wordPermutations2(lastOccurance, str, charArr, currCharacter + 1);
                
                lastOccurance.put(ch, lastOccur);
                charArr[i] = null;
            }
            
        }
        


    }
}
