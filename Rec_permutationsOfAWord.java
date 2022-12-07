import java.util.*;
public class Rec_permutationsOfAWord {
    public static void main(String[] args) {
        String str = "aabb";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(freqMap.containsKey(ch) == false){
                freqMap.put(ch, 1);
            }else{
                freqMap.put(ch, freqMap.get(ch) + 1);
            }
        }

        wordPermutations(freqMap, 1, str.length(), "");

    }

    public static void wordPermutations(HashMap<Character, Integer> freqMap, int currentItem, int totalItems, String answerSoFar){
        if(currentItem > totalItems){
            System.out.println(answerSoFar);
            return;
        }

        for(char ch : freqMap.keySet()){
            if(freqMap.get(ch) > 0){
                freqMap.put(ch, freqMap.get(ch) - 1);
                wordPermutations(freqMap, currentItem + 1, totalItems, answerSoFar + ch);
                freqMap.put(ch, freqMap.get(ch) + 1);
            }

        }
    }
}
