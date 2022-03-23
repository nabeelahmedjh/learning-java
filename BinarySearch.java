import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = { 1, 3, 546, 76, 787, 65, 445, 76, 45, -32, -65, -54, 32, 0 };
        int arrLen = arr.length, userInput;
        Scanner scan = new Scanner(System.in);
        userInput = scan.nextInt();
        scan.close();
        binarySearch(arr, arrLen, userInput);
    }

    public static void binarySearch(int arr[], int arrLen, int toFind) {

        int start = 0, end = arrLen - 1, mid;

        while (start < end) {
            mid = start + end / 2;

            if (toFind > arr[mid]) {
                start = mid + 1;
            } else if (toFind < arr[mid]) {
                end = mid - 1;
            } else {
                System.out.println("Found at index: " + mid);
                break;
            }
        }
        System.out.println("Not Found!");

    }

}
