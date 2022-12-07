
import java.util.HashSet;

public class recursion11 {
    public static void main (String[] args)  throws java.lang.Exception{
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqueSubString(str, 0, "", set);
        

    }

    public static void printUniqueSubString(String str, int idx, String newStr, HashSet<String> set){
        // Base Case
        

        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
                System.out.println(newStr);
                set.add(newStr);
                return; 
            }
            
            
        }

        char currChar = str.charAt(idx);

        //to be
        printUniqueSubString(str, idx + 1, newStr + currChar, set);

        
        // not to be
        printUniqueSubString(str, idx + 1, newStr, set);

        
    }
}
