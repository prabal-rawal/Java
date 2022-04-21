public class mini{
	public static void main(String[] args) {
		int[] arr = {17,12,11,34,13,45,67,43,44};
		int ans = max(arr);
		System.out.println(ans);

		int ans_1 = min(arr);
		System.out.println(ans_1);
		
	}
	static int max(int[]arr){
		int max = Integer.MIN_VALUE;
		if(arr.length == 0){
			return -1;
		}for(int i = 0; i< arr.length; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}return max;
	}

	static int min(int[] arr){
		//I don't know what to do I am confused AF like what should we do
		int min = arr[0];
		if(arr.length == 0){
			return -1;
		}for (int i = 1;i<arr.length ;i++ ) {
			if(arr[i]<min){
				min = arr[i];
			}
		}return min;
	}
}
