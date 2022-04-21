import java.util.Arrays;
public class search_in_2d{
	public static void main(String[] args) {
		int[][] arr = {
			{1,2,3,4,5,6},
			{11,22,33,44,55,66}
		};
		int[] ans = searchh1(arr, 22); //format of return value {row,colum}
		System.out.println(Arrays.toString(ans));

	}
	static boolean search(int[][]arr,int target){
		for (int i = 0;i<arr.length ; i++ ) {
			for(int j = 0; j<arr[i].length;j++){
				if(arr[i][j] == target){
					return true;
				}
			}
		}return false;
	}

	static int[] searchh1(int[][]arr, int target){
		for(int row = 0; row<arr.length; row++){
			for(int column = 0; column< arr[row].length; column++){
				if(arr[row][column] == target){
					return new int[]{row,column}; 
				}
			}
		}return new int[] {-1,-1};
	}

}