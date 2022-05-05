import java.util.ArrayList;
import java.util.Arrays;

public class prime {
    public static void main(String[] args) {
        boolean out = prime_check(4);
//        System.out.printf(Boolean.toString(out));

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,21,13,123,1232,312,12));
        for (int j : arr) {
            System.out.print(prime_check(j) + " ");
        }
    }
//A prime number (or a prime) is a natural number greater than 1 that is not a product of two smaller natural numbers
    static boolean prime_check(int num){
        if(num == 1) return false;
        if(num == 2) return true;
        for (int i = 2; i <Math.sqrt(num)+1 ; i++) {
            if (num % i ==0) return false;
        }return true;
    }
}
