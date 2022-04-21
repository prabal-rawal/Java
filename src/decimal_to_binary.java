public class decimal_to_binary {

    static void binu(int a){
        int[] arr = new int[32];
        int i = 0;
        while(a>0){
            arr[i] = a%2;
            a/=2;
            i++;
        }   
        for(int j = i-1; j>=0; j--){
            System.out.print(arr[j]);
        }
    }
    public static void main(String[] args) {
        int a = 69;
        System.out.println("Ans: "); binu(a);
    }
}
