public class recursion10 {

    public static void main (String[] args)  throws java.lang.Exception{
        String str = "abc";
        printSubString(str, 0, "");

    }

    public static void printSubString(String str, int idx, String newStr){
        // Base Case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);

        //to be
        printSubString(str, idx + 1, newStr + currChar);

        
        // not to be
        printSubString(str, idx + 1, newStr);

        
    }
}
