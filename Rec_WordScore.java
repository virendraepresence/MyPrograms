public class Rec_WordScore {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "dad", "good"};
        char[] letters = {'a', 'b', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
        // System.out.println(score.length);
        if(words == null || words.length == 0 || letters == null|| letters.length == 0|| score.length == 0){
            System.out.println(0);
            return;
        }

        int[] freqArray = new int[score.length];
        for(char ch : letters){
            freqArray[ch-'a']++;
        }

        System.out.println(solution(words, freqArray, score, 0));
    }


    public static int solution(String[] words, int[] freqArray, int[] score, int idx){
        if(idx == words.length){
            return 0;
        }
        int scoreForNo = solution(words, freqArray, score, idx+1);

        int sWord = 0;
        String word = words[idx];
        boolean flag = true;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            if(freqArray[ch-'a'] == 0){
                flag = false;
            }
            freqArray[ch - 'a']--;
            sWord += score[ch - 'a'];
        }

        int scoreForYes = 0;
        if(flag){
            scoreForYes = sWord + solution(words, freqArray, score, idx+1);
        }

        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            freqArray[ch - 'a']++;
        }

        return Math.max(scoreForNo, scoreForYes);

    }
}
