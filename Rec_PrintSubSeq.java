public class Rec_PrintSubSeq {
    public static void main(String[] args) {
        String str = "AbcD";
        printSubSeq(str, "");
    }

    public static void printSubSeq(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        String restOfString = str.substring(1);

        printSubSeq(restOfString, ans + ch);
        printSubSeq(restOfString, ans + "");
    }
}
