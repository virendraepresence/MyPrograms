public class Rec_PrintAllAbbreviation {
    public static void main(String[] args) {
        String str = "pep";
        printAbbreviation(str, "", 0, 0);
    }

    public static void printAbbreviation(String str, String answerSoFar, int count, int position){
        if(position == str.length()){
            if(count != 0)
                System.out.println(answerSoFar + count);
            else
                System.out.println(answerSoFar);

            return;
        }

        if(count > 0)
            printAbbreviation(str, answerSoFar + count + str.charAt(position) , 0, position + 1);
        else
            printAbbreviation(str, answerSoFar + str.charAt(position), 0, position + 1);

        printAbbreviation(str, answerSoFar, count + 1, position + 1);
    }
}