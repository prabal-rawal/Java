import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the first number: ");
            float i = sc.nextFloat();
            System.out.println("Please enter the second number: ");
            float j = sc.nextFloat();
            System.out.println("Please enter the operator(+,-,*,/,%): ");
            char k = sc.next().charAt(0);
            float ans = calc(i, j, k);
            System.out.println(ans);
        }
    }
    static float calc(float a, float b, char c){
        switch(c){
            case '+':return a + b;
            case '-':return a - b;
            case '/':return a/b;
            case '*':return a*b;
            case '%':return a%b;
            default: System.out.println("Enter a valid keyword");
        }
        return 0;
    }
}
