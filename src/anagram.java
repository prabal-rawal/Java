import java.util.Arrays;
public class anagram{
    /*An anagram is a word or phrase formed by rearranging the letters of a different 
    word or phrase, typically using all the original letters exactly once. For example, 
    the word anagram itself can be rearranged into nag a ram, also the word binary 
    into brainy and the word adobe into abode.*/
        public static void main(String[] args) {
        boolean ans = isAnagram("anagram", "nagaram");
        System.out.println(ans);
    }
    public static boolean isAnagram(String s, String t) {
        //to check if the gievn string s and t are anagram or not
        //output would be either true and false
        var a = s.toCharArray();
        var b = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return new String(a).equals(new String(b));
    }
    public static boolean isAnagram2(String s, String t) {
        int n1 = s.length(); int n2 = t.length();
        
        if(n1 == n2){
            int[] count = new int[26];
            for(int i = 0; i < n1; i++){
                count[s.charAt(i) - 'a']++;
                count[t.charAt(i) - 'a']--;
            }
            for(int i = 0; i < 26; i++){
                if(count[i] != 0) return false;
            }
            return true;
        }else{
            return false;
        }
    }
}