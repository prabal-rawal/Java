public class darray{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{12123,123,23,213,21},{132312}};
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