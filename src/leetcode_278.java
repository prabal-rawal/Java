public class leetcode_278 {
    public static void main(String[] args) {
        int ans = firstBadVersion(8);
        System.out.println(ans);
        }
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n; 
        int result = n; 
        //As we know that the last value will always be bad cause each version is hereditary
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)){
                result = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return result;
    }
    public static boolean isBadVersion(int m) {
        return true;
    }
}
