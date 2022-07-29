public class fibb{
    public static void main(String[] args) {
//fibb seriers : 0,1,1,2,3,5,8,....nth term; we will describe the nth term in the below code snippet

        int a = 0; int b = 1; int c = 0; int n = 7;  // will print upto nth term
        System.out.print(a + ", " + b + ", "); 
        for(int i = 0; i < n-2; i++){ // we will print upto n-2 because we have already printed 0 and 1
            c = a + b;           // c = a + b
            System.out.print(c + ", ");
            a = b;               // a = b   // a = 1  
            b = c;              // b = c   // b = 1
        }
    }
}
