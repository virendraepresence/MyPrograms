public class recursion6 {
    public static int first = -1;
    public static int last = -1;


    public static void main (String[] args) throws java.lang.Exception{
        String str = "nahKraaMseeT";
        // int idx = str.length() -1;

        firstOccur(str, 0, 'a');
        


    }

    public static void firstOccur(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;

        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        

        firstOccur(str, idx+1, element);
    }
}
