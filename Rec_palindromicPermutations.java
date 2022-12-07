import java.util.*;
public class Rec_palindromicPermutations {
    public static void main(String[] args) {
        String str = "malayalam";
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freqMap.containsKey(ch)){
                int oddFreq = freqMap.get(ch);
                freqMap.put(ch, oddFreq + 1);
            }else{
                freqMap.put(ch, 1);
            }
        }
        Character oddChar = null;
        int odds = 0;
        int len = 0;
        for(char ch : freqMap.keySet()){
            int freq = freqMap.get(ch);
            if(freq%2 == 1){
                oddChar = ch;
                odds++;
            }
            freqMap.put(ch, freq/2);
            len += freq/2;
        }

        if(odds>1){
            System.out.println(-1);
            return;
        }
        printPalindromicPermutations(1, len, freqMap, oddChar, "");

    }

    public static void printPalindromicPermutations(int currSpot, int totalSpots, HashMap<Character, 
                                            Integer> freqMap, Character oddChar, String answerSoFar){
        if(currSpot == totalSpots){
            String rev = "";
            for(int i = answerSoFar.length() -1; i>=0; i--){
                rev += answerSoFar.charAt(i);
            }
            String res = answerSoFar;
            if(oddChar != null){
                res += oddChar;
            }

            System.out.println(res + rev);
            return;
        }
        for(char ch: freqMap.keySet()){
            int freq = freqMap.get(ch);
            if(freq>0){
                freqMap.put(ch, freq-1);
                printPalindromicPermutations(currSpot + 1, totalSpots, freqMap, oddChar, answerSoFar + ch);
                freqMap.put(ch, freq);
            }
        }
    }
}
