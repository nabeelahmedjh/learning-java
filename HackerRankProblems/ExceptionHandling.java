package com.HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int x, y, a = 0;
        Scanner scan = new Scanner(System.in);

        try {
            x = scan.nextInt();
            y = scan.nextInt();
            a = x/y;
            System.out.println(a);
        }
        catch (InputMismatchException ec) {
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e) {
            System.out.println(e);
        }


    }
}
