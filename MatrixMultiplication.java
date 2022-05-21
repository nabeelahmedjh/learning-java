package practice;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {{1, 2},
                {3, 4}};
        int[][] m2 = {{0,1},
                {2,1}};

        int[][] m = new int[m1.length][m2[0].length];


        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < m2.length; k++) {
                    sum += m1[i][k] * m2[k][j];
                }
                m[i][j] = sum;
                System.out.println(sum);
            }
        }

        for (int[] arr : m) {
            for(int member : arr) {
                System.out.print(member + " ");
            }
            System.out.println();
        }
    }
}
