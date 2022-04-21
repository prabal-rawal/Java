
public class search_in_strings{
	public static void main(String[] args) {
		
		String str = "Pyramid";
		char target = 'a';
		boolean ans = search(str, target);
		System.out.println(ans);

	}
	static boolean search(String a, char b){
		int k = a.length();
		if(k == 0){
			return false;
		}
		for(int i =0; i< a.length(); i++){
			if(b == a.charAt(i)){
				return true;
			}
		}return false;
	}
}
