public class recursion8 {
    public static void main (String[] args)  throws java.lang.Exception{
        String str = "axbcxxd";


        char c = 'x';

        newString(str, 0, 0, "");

        
        


    }

    public static void newString(String str, int idx, int count, String newStr){

        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newStr += 'x';
            }
            System.out.print(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        if(currChar == 'x'){
            count++;
            newString(str, idx+1, count, newStr);
        }else{
            newStr += currChar;
            newString(str, idx+1, count, newStr);
        }


        
        
    }


}
