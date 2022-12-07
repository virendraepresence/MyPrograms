public class recursion9 {

    public static boolean[] map = new boolean[26];
    public static void main (String[] args)  throws java.lang.Exception{
        String str = "abbccda";


        removeDuplicates(str, 0, "");

        
        


    }

    public static void removeDuplicates(String str, int idx, String newStr){

        // Base Case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }


        char currChar = str.charAt(idx);

        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx + 1, newStr);
            
        }else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx +1 , newStr);
        }


        
        
    }

    
}
    

