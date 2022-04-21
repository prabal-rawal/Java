import java.util.Arrays;

public class rowcolmatrix {
    public static void main(String[] args) {
        int[][] array = { // 2D Array
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int target = 39; // target/no. we have to find

        int[] ans = search(array, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0; // row
        int c = matrix.length - 1; // column

        while (r < matrix.length && c >= 0) { // while row and column are in the matrix
            if (matrix[r][c] == target) { // if the target is found
                return new int[] { r, c }; // return the row and column
            }
            if (matrix[r][c] < target) { // if the target is less than the current value
                r++; // increment row
            } else { // if the target is greater than the current value
                c--; // decrement column
            }
        }
        return new int[] { -1, -1 }; // return -1 if target is not found
    }
}
