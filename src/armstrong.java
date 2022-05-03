//n: No. of terms to print
//Armstrong number is n number theory, a narcissistic number in a given number
//base b is a number that is the sum of its own digits each raised to the power of the number of digits.
//Example: 0, 1, 153, 370, 371 and 407

public class armstrong {
    static int digits(int n){
        int count = 0;
        while (n != 0) {
            // num = num/10
            n /= 10;
            ++count;
        }return count;
}
    static boolean arm_check(int n) {
        int sum = 0; int k = n; int digits = 0;
        while (k > 0) {
            var rem = k % 10;
            k /= 10;
            sum += Math.pow(rem,digits(n));
        }
        return sum == n;
    }
    public static void main(String[] args) {
        boolean ans = arm_check(371);
        System.out.print(ans);
    }
}
