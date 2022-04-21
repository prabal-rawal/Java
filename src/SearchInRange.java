
public class SearchInRange{
	public static void main(String[] args) {
		int[] arr = {8,12,-7,3,14,28}; int target = 14;
		int start = 1; int end = 3;
		boolean ans = search(arr,start,end,target);
		System.out.println(ans);

	}
	static boolean search(int[]arr,int a, int b, int target){
		if(arr.length == 0){
			return false;
		}
		for(int i = a; i<=b; i++){				//iterates through the array 
			if(arr[i] == target){				//checks if arr[i] is equals to target
				System.out.println(i);			
				return true;					//If target is found it returns true
			}
		}return false;
	}
}
