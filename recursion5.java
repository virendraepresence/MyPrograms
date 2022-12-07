public class recursion5 {

    

    public static void main (String[] args) throws java.lang.Exception{
        String str = "nahKraaMseeT";
        int idx = str.length() -1;

        revString(str, idx);
        


    }

    public static void revString(String str, int idx){
        
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }


        System.out.print(str.charAt(idx));
        revString(str, idx - 1);
        

    }
}
