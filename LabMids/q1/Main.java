package LabMids.q1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arrSize;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        arrSize = scan.nextInt();
        int[] arr = new int[arrSize];

        for (int i =0; i < arrSize; i++) {
            System.out.print("Enter value of index " + i + " :");
            arr[i] = scan.nextInt();
        }
        int[] arrDouble = new int[arrSize];
        double[] arrHalf = new double[arrSize];

        doubleValue(arr, arrDouble);
        halfValue(arr, arrHalf);


        System.out.println("---DOUBLE VALUES----");
        for(int i = 0; i < arrSize; i++) {
            System.out.println(arrDouble[i]);
        }

        System.out.println("---HALF VALUES----");
        for(int i = 0; i < arrSize; i++) {
            System.out.println(arrHalf[i]);
        }


    }


    public static void halfValue(int[] arr, double[] arrHalf) {

        for (int i = 0; i < arr.length; i++) {
            arrHalf[i] = arr[i]/2.0;
        }

    }




    public static void doubleValue(int[] arr, int[] arrDouble) {
        for (int i = 0; i < arr.length; i++) {
            arrDouble[i] = 2*arr[i];
        }
    }


}
