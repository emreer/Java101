public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6}};

        printTranspose(matrix);
    }

    public static void printTranspose(int[][] matrix) {
        int[][] tMatrix = new int[matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int col = 0; col < matrix[0].length; col++) {
                tMatrix[col][rows] = matrix[rows][col];
            }
        }
        print(tMatrix);
    }

    public static void print(int[][] matrix) { // This method for print array.
        for (int[] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}