import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args){
	    int[] array = {5,3,1,2,4};
        optimised_bubble(array);

    }
    static int[] sorts(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length -i -1 ; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1 ] = temp;
                }
            }
        }return arr;
    }

    //optimised bubble sort

    static void optimised_bubble(int arr[]){
        for(int i = 0; i< arr.length; i ++){
            boolean swap = false;
            for (int j = 1; j < arr.length- i; j++) {
                //compare : swap if smaller than previous item
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1 ] = temp;
                    swap = true;
                }
            }
            if(!swap){break;};
        }
        System.out.println(Arrays.toString(arr));
    }
}
