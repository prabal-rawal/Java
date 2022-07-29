import java.util.Arrays;

class selects {
    public static void main(String[] args) {
        int[] arr = {8,22,7,9,31,5,13};
        int[] ans = selection(arr);
        System.out.println(Arrays.toString(ans));
        
    }
    static int[] selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max(int) in the array and swap with right most index
            int last_index = arr.length -i -1;
            //cause for first time int i = 0; hence it will arr.length - 1, i.e last element of the array
            int max_index = get_max_index(arr, 0, last_index);
            swapped_array(arr, max_index, last_index);

        }return arr;
    }

    static void swapped_array(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int get_max_index(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}