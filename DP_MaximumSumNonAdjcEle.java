public class DP_MaximumSumNonAdjcEle {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {5,10,10,100,5,6};

        int include = arr[0];
        int exclude = 0;

        for(int i = 1; i<n; i++){
            int newInclude = arr[i] + exclude;
            int newExclude = Math.max(include, exclude);

            include = newInclude;
            exclude = newExclude;
        }

        System.out.println(Math.max(include, exclude));
    }
}
