import java.util.Scanner;
public class cgpa {

    static float result(int[]array){
        float sum = array[0]*4 + array[1]*4 + array[2]*4 + array[3]*3 + array[4]*3 + 
        array[5]*2 + array[6]*2 + array[7]*1 + array[8]*1;
        float cgpa = sum/24;
        return cgpa;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scores[] = new int[9];

        System.out.println("Enter the scores of the subjects in the following order seperated by space ");
        System.out.println("(Maths, Chemistry, BEC, English Communication, EST,"+
        " Manufacturing Lab,English Communication Lab, Chemistry Lab):");

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
        }sc.close();
        float ans = result(scores);
        System.out.println("CGPA: "+ ans);
    }
}