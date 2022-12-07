import java.util.*;
public class Rec_FriendsPairing {
    static int counter = 1;
    public static void main(String[] args) {
        int n = 3;
        boolean[] used = new boolean[n+1];
        pairedFriends(n, 1, used, "");
    }

    public static void pairedFriends(int n, int idx, boolean[] used, String answerSoFar){
        if(idx > n){
            System.out.println(counter + ": " + answerSoFar);
            counter++;
            return;
        }

        if(used[idx] == true){
            pairedFriends(n, idx+1, used, answerSoFar);
        }else{
            used[idx] = true;
            pairedFriends(n, idx+1, used, answerSoFar + "(" + idx  + ")");

            for(int j = idx + 1; j<=n; j++){
                if(used[j] == false){
                    used[j] = true;
                    pairedFriends(n, idx+1, used, answerSoFar + "(" + idx + ", " + j + ")" );
                    used[j] = false;
                }
            }

            used[idx] = false;
        }
    }
}
