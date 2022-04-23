package temp;

public class MatricesMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {{1, 3},
                {2, 5}};

        int[][] m2 = {{2, 4},
                {0, 6}};


        // multiplication is of matrices is only possible when number of columns
        // in the first matrix is the same as the number of rows in the second matrix.

        // size of new matrix will be number of rows of first matrix, number of columns of second matrix

        if (m1[0].length != m2.length) {
            System.out.println("multiplication not possible");
            System.exit(1);
        }

        int[][] m3 = new int[m1.length][m2[0].length];
        System.out.println("Number of Rows of m3: " + m3.length);
        System.out.println("Number of columns of m3: " + m3[0].length);

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[0].length; j++) {
                int sum = 0;

                for (int k = 0; k < m3.length; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                m3[i][j] = sum;
            }

        }


        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[0].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
