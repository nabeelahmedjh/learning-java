import java.util.*;
import java.io.*;

class HackerRankP_1 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for (int j = 0; j < n; j++) {
                int value = a;
                for (int k = 0; k <= j; k++) {
                    value += Math.pow(2, k) * b;
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
        in.close();
    }
}