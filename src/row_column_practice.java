import java.util.Arrays;

public class row_column_practice {
    public static void main(String[] args) {
        int[][] matrix = { // 2D Array
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
        };
        int target = 29;
        int[] ans = search(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr, int target){
        int r = 0;
        int c = arr.length - 1;
        while (r<arr.length && c>=0){
            if(arr[r][c] == target) return new int[] {r,c};
            if(arr[r][c] < target) r++;
            else c--;
        }return new int[] {-1,-1};
    }
}
