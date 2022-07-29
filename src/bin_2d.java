import java.util.Arrays;

public class bin_2d{
    public static void main(String[] args) {
        int[][] arr = {                 //Sorted array
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {14, 15, 16, 17}
        };
        int target = 2;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int[][]matrix, int target){
        if (matrix == null) {
            throw new IllegalArgumentException("Input is null");
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1,-1};
        }

        int cols = matrix[0].length;
        int start = 0;
        int end = matrix.length * cols - 1;  //???

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int r = mid / cols;
            int c = mid % cols;
            if (target == matrix[r][c]) {
                return new int[]{r,c};
            }
            if (target < matrix[r][c]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
