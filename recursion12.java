public class recursion12 {
    public static void main(String[] args) {
        String str = "4";
        printCombinations(str, 0, "");
    }

    public static String[] keyPad =  {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombinations(String str, int idx, String combination){
        //base case
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }
        
        char currChar = str.charAt(idx);
        String mapping = keyPad[currChar - '0'];
        for(int i = 0; i<mapping.length(); i++){
            printCombinations(str, idx+1, combination + mapping.charAt(i));
        }
    }
}
