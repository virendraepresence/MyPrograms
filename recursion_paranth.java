import java.util.*;
public class recursion_paranth {
    static List <String> answer = new ArrayList<>();

    public static void main(String[] args) {
        static int counter = 0;
        List<String> list = generateParenthesis(3);
        for(String s : list){
            System.out.println(s);
        }
    }
    public static List<String> generateParenthesis(int n) {
        helper(n,1,0,"(");
        return answer;
    }

    public static void helper (int n , int left, int right,String s){
        
        if (s.length() == n*2){
            answer.add(s);
            return;
        }
        
        if (left<n){
            helper(n,left+1,right,s+"(");
        }
        if (right<left){
            helper(n,left,right+1, s+"\')");
        }   
    }
}
