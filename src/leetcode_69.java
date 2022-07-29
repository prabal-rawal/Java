//
//
//public class leetcode_69 {
//    public static void main(String[] args) {
//
//    }
//    static int sqrt(int num){
//        int low = 1 ; int high = num;
//        while (low < high){
//            int mid = low + (high - low)/2;
//            long sqr = (long) mid * mid;
//            if(sqr == num) {
//                return mid;
//            }
//            if(sqr < num){
//                low = mid + 1;
//            }else{
//                high = mid - 1;
//            }
//    }return -1;
//}