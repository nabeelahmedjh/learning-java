package HackerRankProblems;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println(str.substring(start, end));
    }
}
