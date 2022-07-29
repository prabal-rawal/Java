import java.util.Arrays;

class bubbly{
    public static void main(String[] args){
        int arr[] = {8,22,7,9,31,5,13};
        int[] ans = sorted(arr);
        System.out.println(Arrays.toString(ans));

    }
    static int[] sorted(int[] arr){
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                    num ++;
                }
            }if(!swap){break;}
        }
        System.out.println("No. of swaps : " + num);
        return arr;
    }
}