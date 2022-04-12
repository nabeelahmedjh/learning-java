package HackerRankProblems.ArrayList;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner scan = new Scanner(System.in);
        int n, d, q, x, y;
        n = scan.nextInt();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(n);

        ArrayList<Integer> subArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            d = scan.nextInt();
            for (int j = 0; j < d; j++) {
                // code here
                subArr.add(scan.nextInt());
            }
            arr.add(new ArrayList<Integer>(subArr));
            subArr.clear();

        }
        q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            try {
                System.out.println(arr.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        scan.close();

    }
}
