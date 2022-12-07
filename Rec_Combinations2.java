public class Rec_Combinations2 {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;

        combinations2(new boolean[n], 1, r, -1);
    }

    public static void combinations2(boolean[] boxes, int currentIndex, int r, int lastBox){
        if(currentIndex > r){
            for(int i = 0; i<boxes.length; i++){
                if(boxes[i]){
                    System.out.print("i");
                }else{
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }

        for(int box = lastBox + 1; box<boxes.length; box++){
            if(boxes[box] == false){
                boxes[box] = true;
                combinations2(boxes, currentIndex+1, r, box);
                boxes[box] = false;
            }   
        }

    }
}
