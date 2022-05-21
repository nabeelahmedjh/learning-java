package practice;

import java.util.Scanner;

public class LatinSquareChecker {
    public static void main(String[] args) {
        int rows, columns, n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        rows = n; columns = n;

        int[][] latinSquare = new int[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                latinSquare[i][j] = scan.nextInt();
            }

        }


        // checking if it is a latin square

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                for (int k = 0; k < rows; k++) {
                    if ((latinSquare[i][j] == latinSquare[k][j] || latinSquare[i][j] == latinSquare[i][k]) && !(k == i || k == j)) {
                        System.out.println("Not a Latin Square");
                        System.exit(0);

                    }
                }
            }
        }
        System.out.println("Square is Latin Square");
    }
}
