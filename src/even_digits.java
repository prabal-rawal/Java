
public class even_digits{
	public static void main(String[] args) {
	int[] arr = {18,124,9,1764,98,1};
	int ans = findNumbers(arr);
	System.out.println(ans);

	}
	static int findNumbers(int[] nums) {
		int count = 0;
		for(int num: nums){
			if(even(num)){
				count++;
			}
		}return count;
	}
	static boolean even(int num){
		int count = 0;
		while(num>0){
			count ++;
			num/=10;
		}if(count%2 == 0){
			return true;
		}return false;
	}
}