package exercise;


public class demo6 {

    private static String findElement(int[][] matrix, int target) {
        int row = 0, column = 0;
        while (row < matrix.length) {
            int colMax = matrix[row].length - 1;
            if (matrix[row][column] <= target && matrix[row][colMax] >= target) {
                for (int i = 0; i < matrix[row].length; i++) {
                    if (matrix[row][i] == target)
                        return "matrix[" + row + "][" + i + "]";
                }
            }
            row++;
        }
        return "null";
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {11}};
        System.out.println(findElement(matrix, 6));
    }

}