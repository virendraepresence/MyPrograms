import java.util.*;
public class Rec_ValidParanthesisWithMinRemoval {
    public static void main(String[] args) {
        String str = ")()()(()(()";
        HashSet<String> alreadyPrinted = new HashSet<>();
        int minRemovalAllowed = 3;

        diffValidParanthesis(str, minRemovalAllowed, alreadyPrinted);
    }

    public static void diffValidParanthesis(String str, int minRemovalAllowed, HashSet<String> alreadyPrinted){
        if(minRemovalAllowed == 0){
            if(getMinNum(str) == 0){
                if(alreadyPrinted.contains(str) == false){
                    System.out.println(str);
                    alreadyPrinted.add(str);
                }
            }
            return;
        }

        for(int i = 0; i<str.length(); i++){
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            diffValidParanthesis(left + right, minRemovalAllowed - 1, alreadyPrinted);
        }
    }

    public static int getMinNum(String str){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                if(st.size() == 0){
                    st.push(ch);
                }else if(st.peek() == ')'){
                    st.push(ch);
                }else if(st.peek() == '('){
                    st.pop();
                }
            }
        }

        return st.size();
    }

}
