public class darray{
    public static void main(String[] args) {
        int[][] arr = {                
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 28, 29, 37, 49 },
            { 33, 34, 38, 50 }
        };
        int target = 12983;
        System.out.println(arr.length);
        System.out.println(search(arr, target));
        
    }
    static boolean search(int[][]arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}