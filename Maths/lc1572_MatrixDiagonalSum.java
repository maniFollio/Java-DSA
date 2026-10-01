public class lc1572_MatrixDiagonalSum {
    // Brute Froce Approach.
    int diagnolSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j) {
                    sum += mat[i][j];
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i + j == mat.length - 1) {
                    sum += mat[i][j];
                }
            }
        }
        if (mat.length % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }

    int diagnolSumAgain(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        // for (int[] row : mat) {
        // for (int val : row) {
        // System.out.print(val + " ");
        // }
        // System.out.println();
        // }
        lc1572_MatrixDiagonalSum lc1572 = new lc1572_MatrixDiagonalSum();
        System.out.println(lc1572.diagnolSumAgain(mat));
    }
}
