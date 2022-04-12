package HackerRankProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arrLen = scan.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrLen; i++) {
            arr.add(scan.nextInt());
        }
        int numberOfQueries = scan.nextInt();
        for (int i = 0; i < numberOfQueries; i++) {
            String query = scan.next();
            if (query.equals("Insert")) {
                int location, value;
                location = scan.nextInt();
                value = scan.nextInt();
                arr.add(location, value);
            } else if (query.equals("Delete")) {
                arr.remove(scan.nextInt());
            }
        }

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
