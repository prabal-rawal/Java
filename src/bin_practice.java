
public class bin_practice{
	public static void main(String[] args) {
		int[] arr = {3,4,7,13,15,16,19,21,25,28,81,100,120};
		int target = 4;
		int out = binary_ser(arr, target);
		System.out.println(out);
		
	}
	static int binary_ser(int[] arr, int target){
		//returns index
		int start = 0; int end = arr.length - 1;
		while(start<= end){
			int mid = start + (end - start/2);
			if(arr[mid] > target){
				end = mid - 1;
			}else if(arr[mid]<target){
				start = mid + 1;
			}else {
				return mid;
			}
		}return -1;
	}

}