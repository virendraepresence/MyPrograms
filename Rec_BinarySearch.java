public class Rec_BinarySearch {
    public static void main(String[] args) {
		int n = 5;
		int[] arr = {-5,-2,1,3,5,8,11,14,17,19,20};
		int answer = binarySearch(n, 0, arr.length -1, arr);
		System.out.println(answer);
	}
	
	public static int binarySearch(int n, int i, int j, int[] arr){
	    if(j>=i){
	        int mid = i + (j-i)/2;
	        
	        if(arr[mid] == n)
	            return mid;
	            
	        if(arr[mid] < n){
	            int a = binarySearch(n, mid+1, j, arr);
	            return a;
	        }else{
	            int b = binarySearch(n, i, mid-1, arr);
	            return b;
	        }
	    }
	    return -1;
	}
}
