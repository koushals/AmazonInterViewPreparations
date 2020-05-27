package QAE;

public class RotateImageMatrix {
    public static void main(String[] args) {
        int[][] a = {
        {5, 1, 9,11},
        {2, 4, 8,10},
        {13, 3, 6, 7},
        {15,14,12,16}};
        rotate(a);
    }

    public static int[][] rotate(int[][] matrix) {
        int result[][] = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int r = matrix.length-1;
            int c = i;
            for (int j = 0; j < matrix[i].length; j++) {
                result[i][j] = matrix[r--][i];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.print(" ");
        }
        return result;
    }
}
