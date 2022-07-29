public class palindrome {
    public static void main(String[] args) {
        boolean out = palindrome_check(110011);
        System.out.println(out);
    }
    static boolean palindrome_check(int num){
        return num == reverse_num(num);
    }
    static int reverse_num(int num){
        int reverse = 0;
        while (num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num/=10;
        }
        return reverse;
    }

    int reverse(int num){
        int reverse = 0;
        while (num > 0){
            int rem = num % 10;
            reverse = reverse + rem;
            num/=10;
        }return reverse;
    }
}

// Reversing a number:
// first we will declare an int  lets say reverse of value 0.
// We will create while loop condt: num>0, num=> INPUT
// then declare int remainder = num %10
// then declare int reverse = reverse + rem * 10
