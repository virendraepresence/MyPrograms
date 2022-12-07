public class Rec_PrintEncoding {
    public static void main(String[] args) {
        String str = "1234";
        printEncoding(str, "");
    }

    public static void printEncoding(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }else if(str.length() == 1){
            if(str.charAt(0 ) == '0'){
                return;
            }else{
                int charValue = str.charAt(0) - '0';
                char charCode = (char) ('a' + charValue -1);
                System.out.println(ans + charCode);
            }
        }else{
            char ch = str.charAt(0);
            String restOfString = str.substring(1);
            if(ch == '0'){
                return;
            }else{
                int charValue = ch - '0';
                char charCode = (char) ('a' + charValue -1);
                printEncoding(restOfString , ans + charCode);
            }

            String firstTwoChar = str.substring(0,2);
            String afterFirstTwoChar = str.substring(2);

            int firstTwoCharValue = Integer.parseInt(firstTwoChar);
            if(firstTwoCharValue <= 26){
                char charCodefirst2 = (char) ('a' + firstTwoCharValue - 1);
                printEncoding(afterFirstTwoChar, ans + charCodefirst2);
            }

        }

        
    }
}
