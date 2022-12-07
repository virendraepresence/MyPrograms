public class Rec_JoshephsProblem {
    public static void main(String[] args) {
        int n = 8;
        int k = 3;
        System.out.println(solution(n, k));

    }

    public static int solution(int n, int k){
        if(n==1){
            return 0;
        }

        int surviver = solution(n-1, k);
        int y = (surviver+k)%n;
        return y;
    }
}
