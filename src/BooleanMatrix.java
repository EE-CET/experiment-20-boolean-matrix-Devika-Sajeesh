import java.util.Scanner;

public class BooleanMatrix {

    static void BooleanMatrix(int[][] mat, int m, int n) {

        for (int i = 0; i < m; i++) {
            boolean hasOne = false;

            // Check if row i contains a 1
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    hasOne = true;
                    break;
                }
            }

            // If row has a 1, fill entire row with 1s
            if (hasOne) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        BooleanMatrixProblem(mat, m, n);

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
