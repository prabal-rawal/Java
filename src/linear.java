public class linear {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        //find whether 14 exists in the array or not
        int target = 7728;

        boolean ans = linear_search3(arr, target);
        System.out.println(ans);
    }

    static int linear_search(int[] arr, int target) {

        if (arr.length == 0) {
            return Integer.MAX_VALUE;  //empty array
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  //item found
            }
        }
        return Integer.MAX_VALUE;  // item not found
    }

    static int linear_search2(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }

    static boolean linear_search3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}


