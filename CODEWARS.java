public class CODEWARS {
    public static void main(String[] args) {
        int[][] matrix = {
                {5, 3, 6, 1},
                {5, 8, 7, 4},
                {1, 2, 4, 3},
                {3, 1, 2, 2}

        };
        int[][] res = rotateLikeVortex(matrix);
        for (int i = 0; i<res.length; i++) {
            for (int j = 0; j< res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int[][] rotateLikeVortex(int[][] matrix) {
        int length = matrix.length;
        int[][] nArr = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                nArr[i][j] = 0;
            }
        }
        for (int h = 0; h < length/2; h++) {
            for (int i = h; i < length - h; i++) {
                for (int j = h; j < length - h; j++) {
                    nArr[length - 1 - j][i] = matrix[i][j];
                }
            }
            matrix = new int[length][length];
            for (int i = 0; i < length; i++) {
                System.arraycopy(nArr[i], 0, matrix[i], 0, length);
            }
        }
        int[][] res = matrix;
        return res;
    }
}